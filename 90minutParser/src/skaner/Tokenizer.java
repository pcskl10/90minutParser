package skaner;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Tokenizer {
	private int actualCharacter;
	private int line;
	private int column;
	private boolean error;
	BufferedReader reader;

	public Tokenizer(String file) throws IOException {
		reader = new BufferedReader(new FileReader(file));
		column = line = 0;
		error = false;
		nextWithoutWhitespaces();
	}

	public Token getToken() throws IOException {
		int c = actualCharacter;
		
		if(-1 != "(){}".indexOf(c)){
			nextWithoutWhitespaces();
			switch (c) {
			case '(':
				return new Token(TokenType.OPENING_ROUND_BRACKET);
			case ')':
				return new Token(TokenType.CLOSING_ROUND_BRACKET);
			case '{':
				return new Token(TokenType.OPENING_CURLY_BRACKET);
			case '}':
				return new Token(TokenType.CLOSING_CURLY_BRACKET);
			}
		}

		if ('"' == actualCharacter) {
			StringBuilder str = new StringBuilder();
			next();
			if(eof()){
				return null;
			}
			while ('"' != actualCharacter) {
				str.append((char)actualCharacter);
				next();
				if(eof()){
					return null;
				}
			}
			nextWithoutWhitespaces();
			return new Token(TokenType.STRING, str.toString());
		}

		if (Character.isLetter(actualCharacter)) {
			StringBuilder str = new StringBuilder();
			while (Character.isLetter(actualCharacter)) {
				str.append((char)actualCharacter);
				next();
				if(eof()){
					return null;
				}
			}
			if(Character.isWhitespace(actualCharacter)){
				nextWithoutWhitespaces();
			}
			return new Token(TokenType.IDENTIFIER, str.toString());
		}
		
		if(Character.isDigit(actualCharacter)){
			StringBuilder str = new StringBuilder();
			while (Character.isDigit(actualCharacter)) {
				str.append((char)actualCharacter);
				next();
				if(eof()){
					return null;
				}
			}
			if(Character.isWhitespace(actualCharacter)){
				nextWithoutWhitespaces();
			}
			return new Token(TokenType.NUMBER, Integer.parseInt(str.toString()));
		}
		
		if(!eof()){
			error = true;
		}

		return null;
	}
	
	public int actualLineNumber(){
		return line;
	}
	
	public int actualColumnNumber(){
		return column;
	}

	public boolean hasError(){
		return error;
	}
	
	private boolean eof(){
		return -1 == actualCharacter;
	}
	
	private int next() throws IOException {
		actualCharacter = reader.read();
		++column;
		if ('\n' == actualCharacter) {
			++line;
			column = 0;
		}
		return actualCharacter;
	}

	private int nextWithoutWhitespaces() throws IOException {
		next();
		if(eof()){
			return actualCharacter;
		}
		while(Character.isWhitespace(actualCharacter)){
			next();
			if(eof()){
				return actualCharacter;
			}
		}
		return actualCharacter;
	}
	
	public static void main(String[] args){
		Tokenizer tokenizer = null;
		ArrayList<Token> tokens = new ArrayList<Token>();
		try {
			tokenizer = new Tokenizer("liga");
			Token token = tokenizer.getToken();
			while(null != token){
				tokens.add(token);
				token = tokenizer.getToken();
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (EOFException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int j = 0;
		for(Token i: tokens){
			System.out.println("" + ++j + " " + i);
		}
	}
}
