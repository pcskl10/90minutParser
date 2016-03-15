import java.util.ArrayList;
import java.util.List;


public class MatchDay 
{
	public String matchDayNumber;
	public String matchDayDate;
	public List<Match> matches = new ArrayList<Match>();
	
	public MatchDay(String matchDayNumber, String matchDayDate)
	{
		this.matchDayNumber = matchDayNumber;
		this.matchDayDate = matchDayDate;
	}
	
	/*public MatchDay(String numberOfMatchDay, String homeClubName,
			String awayClubName, String result,
			ArrayList<String> homeClubScorers,
			ArrayList<Integer> homeClubGoalsTime,
			ArrayList<String> awayClubScorers,
			ArrayList<Integer> awayClubGoalsTime, Date matchDate, int attendance)
	{
		matches.add(new Match(numberOfMatchDay, homeClubName,
				awayClubName, result,
				ArrayList<String> homeClubScorers,
				ArrayList<Integer> homeClubGoalsTime,
				ArrayList<String> awayClubScorers,
				ArrayList<Integer> awayClubGoalsTime, matchDate, attendance));
	}*/
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder("");
		for(int i = 0; i < matches.size(); i++)
		{
			sb.append(matches.get(i).toString() + "\n");
		}
		return sb.toString();
	}

}
