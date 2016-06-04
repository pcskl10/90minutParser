package Parser;

public class Utensils {

	public static final String PL = "[a-zA-Z\u0104\u0105\u0106\u0107\u0118\u0119\u0141\u0142\u0143\u0144\u00d3\u00f3\u015a\u015b\u0179\u017a\u017b\u017c]";
	public static final String MATCHDAY_AND_DATE_TYPE1 = "\\w+\\s+\\d+\\s+-\\s+\\d+\\s+"+PL+"+"; // TODO
	public static final String MATCHDAY_AND_DATE_TYPE2 = "\\w+\\s+\\d+\\s+-\\s+\\d*-*\\d+\\s+"+PL+"+"; // TODO poprawiæ ¿eby by³o dla nazw klubów z kilkoma wyrazami
	public static final String MATCHDAY_AND_DATE_TYPE3 = "\\w+\\s+\\d+\\s+-\\s+\\d+\\s+"+PL+"+-*\\d+\\s+"+PL+"+"; // TODO
	public static final String MECZ = PL+"+\\s+(("+PL+"+|\\d+)\\s+)*\\d+-\\d+\\s+"+PL+"+\\s+(("+PL+"+|\\d+)\\s+)*\\d+\\s+"+PL+"+,.*";
	//public static final String MECZ2 = PL+"+\\s+(("+PL+"+|\\d+)\\s+)*-\\s+"+PL+"+\\s+(("+PL+"+|\\d+)\\s+)*.*";
	public static final String MECZ2 = PL+"+\\s+(("+PL+"+|\\d+)\\s+)*-\\s+"+PL+"+\\s+(("+PL+"+|\\d+)\\s+)*(\\d+\\s+"+PL+"+,\\s+\\d+:\\d+)?";
	public static final String HOME_CLUB_NAME = PL+"+\\s+(("+PL+"+|\\d+)\\s+)*";
	public static final String AWAY_CLUB_NAME = PL+"+\\s+(("+PL+"+|\\d+)\\s+)*";
	public static final String CLUB_NAME_WITH_DIGIT_END = "\\s+"+PL+"+\\s+"+PL+"+\\s+\\d+\\s+((\\d+||\\d+-\\d+)\\s+){14}";
	public static final String DATE_OF_MATCH_WITH_HOUR = "\\d+\\s+"+PL+"+,\\s+\\d{2}:\\d{2}";
	public static final String RESULT = "\\d+-\\d+\\s+";
	public static final String SPLIT_MATCHDAY_NUMBER_AND_DATE = "\\s+-\\s+";
	
}
