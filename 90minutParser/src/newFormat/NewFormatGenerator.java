package newFormat;

public class NewFormatGenerator {

	public String generateNewFormat(String team) {

		return "";
	}

	public static String generateLeagueName(String leagueName) {
		return "liga(\"" + leagueName + "\"){";
	}

	public static String generateTeamName(String name) {
		return "\tdruzyna(\"" + name + "\"){";
	}

	public static String generateMatchesNumber(int number) {
		return "\t\tmecze(" + number + ")";
	}

	public static String generatePoints(int number) {
		return "\t\tpunkty(" + number + ")";
	}

	public static String generateWonMatches(int number) {
		return "\t\tzwyciestwa(" + number + ")";
	}

	public static String generateDrawMatches(int number) {
		return "\t\tremisy(" + number + ")";
	}

	public static String generateLostMatches(int number) {
		return "\t\tporazki(" + number + ")";
	}

	public static String generateGoals(String number) {
		String tab[] = number.split("-");
		String scored = tab[0];
		String lost = tab[1];
		return "\t\tbramki(){" + "\n\t\t\tstrzelone(" + scored + ")" + "\n\t\t\tstracone(" + lost
				+ ")" + "\n\t\t}";
	}

	public static String generateEndTeam() {
		return "\t}";
	}

	public static String generateEndLeague() {
		return "}";
	}

}
