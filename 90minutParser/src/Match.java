import java.util.ArrayList;


public class Match 
{
	public String numberOfMatchDay;
	public String homeClubName;
	public String awayClubName;
	public String result;
	public ArrayList<String> homeClubScorers;
	public ArrayList<Integer> homeClubGoalsTime;
	public ArrayList<String> awayClubScorers;
	public ArrayList<Integer> awayClubGoalsTime;
	public String matchDate;
	public int attendance;
	
	public Match(String numberOfMatchDay, String homeClubName,
			String awayClubName, String result,
			ArrayList<String> homeClubScorers,
			ArrayList<Integer> homeClubGoalsTime,
			ArrayList<String> awayClubScorers,
			ArrayList<Integer> awayClubGoalsTime, String matchDate, int attendance) 
	{
		super();
		this.numberOfMatchDay = numberOfMatchDay;
		this.homeClubName = homeClubName;
		this.awayClubName = awayClubName;
		this.result = result;
		this.homeClubScorers = homeClubScorers;
		this.homeClubGoalsTime = homeClubGoalsTime;
		this.awayClubScorers = awayClubScorers;
		this.awayClubGoalsTime = awayClubGoalsTime;
		this.matchDate = matchDate;
		this.attendance = attendance;
	}
	
	public String toString()
	{
		return numberOfMatchDay + " " + homeClubName + " " + result + " " + awayClubName + " " + matchDate + " " + attendance;
	}
}
