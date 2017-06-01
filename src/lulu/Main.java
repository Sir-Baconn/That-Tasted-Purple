package lulu;

/**
 * Class to test the stuff 
 * @author steve
 * @author ralph
 */
public class Main {
	public static void main(String[] args) throws Exception{
		//System.out.println(SummonerRequests.getSummoner(32641520, Region.NA));		//get summoner via id
		System.out.println(SummonerRequests.getSummoner("Raki Road", Region.NA));	//get summoner via name
		
		int myid = 32641520;															//used so I don't have to keep typing 32641520
		
		Summoner shadyCloud = SummonerRequests.getSummoner(myid, Region.NA);
		
		shadyCloud.setChampionMasteryScore(SummonerRequests.getChampionMasteryScore(myid, Region.NA));			//set shadyCloud's mastery score
		
		System.out.println(shadyCloud + " " + shadyCloud.getChampionMasteryScore());
	}

}
