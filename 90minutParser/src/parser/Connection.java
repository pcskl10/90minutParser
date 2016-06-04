package parser;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import newFormat.NewFormatGenerator;

public class Connection {

	public static void main(String[] args) {
		/*
		 * try {
		 * 
		 * //table.main - kolejki //table.main tbody tr - ka¿dy wiersz kolejki
		 * //table.main tbody tr td b - dru¿yny i wynik
		 * 
		 * //table.main2 tbody tr - tabela Document doc =
		 * Jsoup.connect("http://90minut.pl/liga/0/liga8069.html").get();
		 * Elements paragraphs = doc.select("table.main2 tbody tr td a");
		 * for(Element p : paragraphs) { System.out.println(p.text());
		 * System.out.println(); } } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		League e = new League("http://www.90minut.pl/liga/0/liga8070.html");
		e.parseTable();

		PrintWriter writer;
		try {
			writer = new PrintWriter("liga", "UTF-8");
			writer.println(NewFormatGenerator.generateLeagueName(e.getLeagueName()));
			for (Team team : e.teamsInLeague) {
				writer.println(NewFormatGenerator.generateTeamName(team.clubName));
				writer.println(NewFormatGenerator.generateMatchesNumber(team.playedMatches));
				writer.println(NewFormatGenerator.generatePoints(team.points));
				writer.println(NewFormatGenerator.generateWonMatches(team.wonMatches));
				writer.println(NewFormatGenerator.generateDrawMatches(team.drawMatches));
				writer.println(NewFormatGenerator.generateLostMatches(team.lostMatches));
				writer.println(NewFormatGenerator.generateGoals(team.goalScoredLost));
				writer.println(NewFormatGenerator.generateEndTeam());
			}
			writer.println(NewFormatGenerator.generateEndLeague());
			writer.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i < e.teamsInLeague.size(); i++) {
			// System.out.println(e.teamsInLeague.get(i).toString());
		}
	}

}
