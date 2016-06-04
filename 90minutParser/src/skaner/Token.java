package skaner;

public class Token {
	private TokenType type;
	private Object value;
	
	public Token(TokenType type){
		this.type = type;
		switch(type){
		case CLOSING_CURLY_BRACKET:
			value = new Character('}');
			break;
		case CLOSING_ROUND_BRACKET:
			value = new Character(')');
			break;
		case OPENING_CURLY_BRACKET:
			value = new Character('{');
			break;
		case OPENING_ROUND_BRACKET:
			value = new Character('(');
			break;
		default:
			value = null;
			break;
		}
	}
	
	public Token(TokenType type, Object value){
		this.type = type;
		this.value = value;
	}
	
	public TokenType getType(){
		return type;
	}
	
	public String getValueAsString(){
		return (String)value;
	}
	
	public int getValueAsInteger(){
		return (Integer)value;
	}
	
	public char getValueAsCharacter(){
		return (Character)value;
	}

	public String toString(){
		String str = "[" + type.toString() + ": ";
		switch(type){
		case CLOSING_CURLY_BRACKET:
		case CLOSING_ROUND_BRACKET:
		case OPENING_CURLY_BRACKET:
		case OPENING_ROUND_BRACKET:
			str += (Character)value;
			break;
		case IDENTIFIER:
		case STRING:
			str += (String)value;
			break;
		case NUMBER:
			str += (Integer)value;
		default:
			break;
		}
		str += "]";
		return str;
	}
}
