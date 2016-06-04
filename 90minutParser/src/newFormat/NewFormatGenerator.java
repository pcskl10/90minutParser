package newFormat;

public class NewFormatGenerator {

	public String generateNewFormat(String team) {

		return "";
	}

	public static String generateLeagueName(String leagueName) {
		return "[liga=" + leagueName + "]";
	}

	public static String generateTeamName(String name) {
		return "\t[druzyna=" + name + "]";
	}

	public static String generateMatchesNumber(int number) {
		return "\t\t[mecze]" + number + "[/mecze]";
	}

	public static String generatePoints(int number) {
		return "\t\t[punkty]" + number + "[/punkty]";
	}

	public static String generateWonMatches(int number) {
		return "\t\t[zwyciestwa]" + number + "[/zwyciestwa]";
	}

	public static String generateDrawMatches(int number) {
		return "\t\t[remisy]" + number + "[/remisy]";
	}

	public static String generateLostMatches(int number) {
		return "\t\t[porazki]" + number + "[/porazki]";
	}

	public static String generateGoals(String number) {
		String tab[] = number.split("-");
		String scored = tab[0];
		String lost = tab[1];
		return "\t\t[bramki]" + "\n\t\t\t[strzelone]" + scored + "[/strzelone]" + "\n\t\t\t[stracone]" + lost
				+ "[/stracone]" + "\n\t\t[/bramki]";
	}

	public static String generateEndTeam() {
		return "\t\t[/druzyna]";
	}

	public static String generateEndLeague() {
		return "[/liga]";
	}

}
