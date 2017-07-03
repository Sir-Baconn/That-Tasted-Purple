package lulu;

import requests.GameRequest;
import requests.LeagueRequest;
import requests.MatchRequest;
import requests.RuneRequest;
import requests.SummonerRequest;
import summoner.Summoner;

import java.util.concurrent.TimeUnit;
/**
 * Class to test the stuff 
 * @author steve
 * @author ralph
 */
public class Main {
	public static void main(String[] args) throws Exception{
		//System.out.println(SummonerRequests.getSummoner(32641520, Region.NA));		//get summoner via id
		//System.out.println(SummonerRequest.getSummoner("Raki Road", Region.NA));		//get summoner via name
		
		int myid = 32641520;															//used so I don't have to keep typing 32641520
		int myaccid = 47380055;
		String matchID = "2537568859"; //needs to be string because number is too big
		
		Summoner shadyCloud = SummonerRequest.getSummoner(myid, Region.NA);
		
		shadyCloud.setChampionMasteryScore(SummonerRequest.getChampionMasteryScore(myid, Region.NA));			//set shadyCloud's mastery score
	    shadyCloud.setLeague(LeagueRequest.getPosition(myid, Region.NA));

		
		System.out.println(shadyCloud + " " + shadyCloud.getChampionMasteryScore());
		
		System.out.println(shadyCloud + " " + shadyCloud.getLeague());
		

		
		System.out.println(RuneRequest.getRune(5337));
		
	    shadyCloud.setGame(GameRequest.getGameInfo(matchID, Region.NA, 1));
		System.out.println(shadyCloud+ " " + shadyCloud.getGame());
		
		for( int i = 0; i<5; i++){																								//Tests if program can get a list of recentmatch ID's
			shadyCloud.setMatch(MatchRequest.getMatchList(myaccid, Region.NA, i));
			System.out.println(shadyCloud + " " + shadyCloud.getMatch());
			TimeUnit.SECONDS.sleep(1);
		}
	

		for (int j = 0; j<5; j++){																								//Tests if program can retrieve list of summonerId's from a game
		    shadyCloud.setGame(GameRequest.getGameInfo(matchID, Region.NA, j));
			System.out.println(shadyCloud+ " " + shadyCloud.getGame());
			TimeUnit.SECONDS.sleep(1);
		}
		
	}

}

