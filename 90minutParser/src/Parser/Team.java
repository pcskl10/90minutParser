package Parser;
import java.util.ArrayList;


public class Team 
{
	public int leaguePosition;
	public String clubName;
	public int playedMatches;
	public int points;
	public int wonMatches;
	public int drawMatches;
	public int lostMatches;
	public String goalScoredLost;
	public int goalBalance;
	public ArrayList<Match> matches = new ArrayList<Match>();

	public Team(int leaguePosition, String clubName, int playedMatches,
			int points, int wonMatches, int drawMatches, int lostMatches,
			String goalScoredLost) 
	{
		super();
		this.leaguePosition = leaguePosition;
		this.clubName = clubName;
		this.playedMatches = playedMatches;
		this.points = points;
		this.wonMatches = wonMatches;
		this.drawMatches = drawMatches;
		this.lostMatches = lostMatches;
		this.goalScoredLost = goalScoredLost;
		this.goalBalance =  countGoalBalance(goalScoredLost);
	}
	
	private int countGoalBalance(String scoredAndLost)
	{
		String[] scoredLost = scoredAndLost.split("-");
		int balance = Integer.parseInt(scoredLost[0]) - Integer.parseInt(scoredLost[1]);
		return balance;
	}
	
	public String toString()
	{
		return this.leaguePosition+". "+this.clubName+" "+this.playedMatches+" "+this.wonMatches+" "
				+this.drawMatches+" "+this.lostMatches+" "+this.goalScoredLost+" "+this.goalBalance;
	}

}
