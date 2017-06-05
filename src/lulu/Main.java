package lulu;


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
		Summoner shadyCloud = SummonerRequest.getSummoner(myid, Region.NA);
		
		shadyCloud.setChampionMasteryScore(SummonerRequest.getChampionMasteryScore(myid, Region.NA));			//set shadyCloud's mastery score
	    shadyCloud.setLeague(LeagueRequest.getPosition(myid, Region.NA));
	    shadyCloud.setMatch(MatchRequest.getMatchList(myaccid, Region.NA));
		
		System.out.println(shadyCloud + " " + shadyCloud.getChampionMasteryScore());
		
		System.out.println(shadyCloud + " " + shadyCloud.getLeague());
		
		System.out.println(shadyCloud+ " " + shadyCloud.getMatch());
	}

}
