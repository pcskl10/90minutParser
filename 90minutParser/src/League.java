import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class League 
{
	public String[] matchDays;
	public ArrayList<Team> teamsInLeague = new ArrayList<Team>();
	public ArrayList<MatchDay> scheduleOfTheLeague = new ArrayList<MatchDay>();
	
	public League(String leagueURL)
	{
		parseSchedule(leagueURL);
		parseTable(leagueURL);
	}
	
	
	private void parseSchedule(String leagueURL)
	{
		String matchDayNumber = null;
		String matchDayDate = null;
		
		String homeClubName = null;
		String awayClubName = null;
		String result = null;
		String dateOfConcreteMatch = null;
		ArrayList<String> homeClubScorers;
		ArrayList<Integer> homeClubGoalsTime;
		ArrayList<String> awayClubScorers;
		ArrayList<Integer> awayClubGoalsTime;
		int attendance;
		
		try 
		{
		            Document doc = Jsoup.connect(leagueURL).get();
		            Elements paragraphs = doc.select("table.main tbody tr");
		            StringBuilder sb = new StringBuilder();
		            for(Element p : paragraphs) 
		            {
		            	sb.append(p.text()+";");
		            }
		            
		            String contentFromWeb = sb.toString();
		            matchDays = contentFromWeb.split(";");
		            String[] temp;
		            String s;
		            
		            /**
		             * Idzie po kolei przez ka¿d¹ linijkê terminarza
		             */
		            for(int i = 0; i < matchDays.length; i++) 
		            {
		            	s = matchDays[i];
		            	
		            	/**
		            	 * Wyszukuje linijkê z numerem kolejki i dat¹ jej rozegrania
		            	 */
		            	if(s.matches(Utensils.MATCHDAY_AND_DATE_TYPE1) // Kolejka 1 - 21 paŸdziernika
		            			|| s.matches(Utensils.MATCHDAY_AND_DATE_TYPE2) // Kolejka 1 - 20-21 paŸdziernika
		            			|| s.matches(Utensils.MATCHDAY_AND_DATE_TYPE3)) // Kolejka 1 - 31 wrzeœnia-1 paŸdziernika
		            	{
		            		temp = s.split(Utensils.SPLIT_MATCHDAY_NUMBER_AND_DATE);
		            		matchDayNumber = temp[0];
		            		matchDayDate = temp[1];
		            	}
		            	
		            	/**
		            	 * Wyszukuje linijkê z nazwami klubów, wynikiem i dat¹, mecze rozegrane i nie rozegrane
		            	 */
		            	if(s.matches(".*-?.*"))//s.matches(Utensils.MECZ) || s.matches(Utensils.MECZ2))
		            	{
		            		boolean flag = false;
		            		if(s.matches(Utensils.MECZ) || s.matches(Utensils.MECZ2))
		            		{
		            			//System.out.println(s);
			            		String[] returned = parseMatchAndDate(s);
			            		homeClubName = returned[0];
			            		awayClubName = returned[1];
			            		result = returned[2];
			            		dateOfConcreteMatch = returned[3];
			            		flag = true;
		            		}
		            		
		            		
		            		if(result != null && !result.equals("0-0") && !flag)
		            		{
		            			String[] returned = parseScorers(s);
		            			for(int j =0; i<s.length();i++)
		            			{
		            				System.out.println(returned[j]);
		            			}

		            		}
		            		
		            		addDataAboutMatchesInMatchdays(matchDayNumber, matchDayDate, homeClubName, awayClubName, result, dateOfConcreteMatch, 0);
		            	}
		            	
		            	
		            }
		           
		 } 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
	}
	
	private void parseTable(String leagueURL)
	{
		try 
		{
		            Document doc = Jsoup.connect(leagueURL).get();
		            Elements paragraphs = doc.select("table.main2 tbody tr td");
		            
		            StringBuilder sb = new StringBuilder(";");
		            for(Element p : paragraphs) 
		            {
		            	sb.append(p.text()+";");
		            }
		            String str = sb.toString();
		            String[] table = str.split(";");
		            
		            StringBuilder sb2 = new StringBuilder("");
		            for(int i = 0; i < table.length-30; i++)
		            {
		            	sb2.append(table[i+30] + " ");
		            }
		            String str2 = sb2.toString();
		            String[] eachTeamTableStats = str2.split("[0-9]+\\.");
		            createTeamsFromThisLeague(eachTeamTableStats);
  
		 } 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
	}
	
	public String getMatchDay(int numberOfMatchDay)
	{
		return matchDays[numberOfMatchDay-1];
	}
	
	public String getTable()
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < teamsInLeague.size(); i++)
		{
			sb.append(teamsInLeague.get(i).toString() + "\n");
		}
		return sb.toString();
	}
	
	public void createTeamsFromThisLeague(String[] eachTeamTableStats)
	{
		String[] table = eachTeamTableStats;
		String[] temp;
		
		for(int j = 1; j < table.length; j++)
		{
			temp = table[j].split(" ");
			if(temp.length > 30)
			{
				temp = Arrays.copyOf(temp, 21);
				temp = Arrays.copyOf(temp, 15+howManyWordsInClubName(temp));
			}
			else
				temp = Arrays.copyOf(temp, 15+howManyWordsInClubName(temp));
			
			if(temp.length == 17 || temp.length == 23)
			{
				teamsInLeague.add(new Team(j, temp[1]+" "+temp[2], Integer.parseInt(temp[3]), Integer.parseInt(temp[4]), Integer.parseInt(temp[5]),
						Integer.parseInt(temp[6]), Integer.parseInt(temp[7]), temp[8]));
			}
			else if(temp.length == 18 || temp.length == 24)
			{
				teamsInLeague.add(new Team(j, temp[1]+" "+temp[2]+" "+temp[3], Integer.parseInt(temp[4]), Integer.parseInt(temp[5]), Integer.parseInt(temp[6]),
						Integer.parseInt(temp[7]), Integer.parseInt(temp[8]), temp[9]));
			}
			else if(temp.length == 16 || temp.length == 22)
			{
				teamsInLeague.add(new Team(j, temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), Integer.parseInt(temp[4]),
						Integer.parseInt(temp[5]), Integer.parseInt(temp[6]), temp[7]));
			}
			else if(temp.length == 19 || temp.length == 25)
			{
				teamsInLeague.add(new Team(j, temp[1]+" "+temp[2]+" "+temp[3]+" "+temp[4], Integer.parseInt(temp[5]), Integer.parseInt(temp[6]), Integer.parseInt(temp[7]),
						Integer.parseInt(temp[8]), Integer.parseInt(temp[9]), temp[10]));
			}
		}
		
	}
	
	private int howManyWordsInClubName(String[] tab)
	{
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < tab.length; i++)
		{
			if((tab[i].matches(".*\\D+.*") || tab[i].matches("\\d{4}")) // np. ROW 1946 Rybnik
					&& !tab[i].matches("\\d+-\\d+") // bramki strzelone- stracone (12-11)
					&& !tab[i].matches("\\s") // bia³e znaki
					)
			{
				count++;
			}
			sb.append(tab[i]+" ");
		}
		String str = sb.toString();
		if(str.matches(".+"+Utensils.PL+"+\\s+\\d+\\s+"+Utensils.PL+"+.*"))
			count++;
		return count;
	}
	

	public String[] parseMatchAndDate(String line)
	{
		String[] clubNamesScoreAndDate = new String[4];
		String date = null;
		
		if(line.matches(Utensils.MECZ))
		{
			Scanner scanerForDate = new Scanner(line);
			date = scanerForDate.findInLine(Utensils.DATE_OF_MATCH_WITH_HOUR);
			line = line.substring(0, line.length()-date.length());
		}
		
		Scanner scanerForClubNames = new Scanner(line);
		Scanner scanerForResult = new Scanner(line);
		
		String homeClubName = scanerForClubNames.findInLine(Utensils.HOME_CLUB_NAME);
		String result = scanerForResult.findInLine(Utensils.RESULT);
		String awayClubName = scanerForResult.findInLine(Utensils.AWAY_CLUB_NAME);
		
		clubNamesScoreAndDate[0] = homeClubName;
		clubNamesScoreAndDate[1] = awayClubName;
		clubNamesScoreAndDate[2] = result;
		if(date != null)
			clubNamesScoreAndDate[3] = date;
		
		return clubNamesScoreAndDate;
	}
	
	public String[] parseScorers(String line)
	{
		String[] scorersHomeAndAway = line.split("-");
		String[] scorersHome = scorersHomeAndAway[0].split(", ");
		String[] scorersAway = null;
		if(scorersHomeAndAway.length > 0)
			scorersAway = scorersHomeAndAway[1].split(", ");
		String[] scorersWithTimeScored = new String[100];
		
		for(int i = 0; i < scorersHome.length; i++)
		{
			Scanner scaner = new Scanner(scorersHome[i]);
			scorersWithTimeScored[2*i] = scaner.findInLine(Utensils.PL + "+\\s+" + Utensils.PL + "+");
			scorersWithTimeScored[2*i+1] = scaner.findInLine("\\d+");
		}
		
		for(int i = scorersWithTimeScored.length; i < scorersAway.length; i++)
		{
			Scanner scaner = new Scanner(scorersAway[i]);
			scorersWithTimeScored[2*i] = scaner.findInLine(Utensils.PL + "+\\s+" + Utensils.PL + "+");
			scorersWithTimeScored[2*(i+1)] = scaner.findInLine("\\d+");
		}
		
		return scorersWithTimeScored;
	}
	
	
	public void addDataAboutMatchesInMatchdays(String matchDayNumber, String matchDayDate, String homeClubName, String awayClubName, String result, 
			String dateOfConcreteMatch, int attendance)
	{
		MatchDay matchday = new MatchDay(matchDayNumber, matchDayDate);
		Match match = new Match(matchDayNumber, homeClubName, awayClubName, result, null, null, null, null, dateOfConcreteMatch, attendance);
		matchday.matches.add(match);
		scheduleOfTheLeague.add(matchday);
	}
	
}
