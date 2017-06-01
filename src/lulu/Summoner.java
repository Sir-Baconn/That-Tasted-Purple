package lulu;

/**
 * Summoner class that represents a summoner in LOL. This will act as a summoner's profile.
 * @author steve
 * @author ralph
 */
public class Summoner {

	private long id;
	private String name;
	private int profileIconId;
	private String revisionDate;
	private int summonerLevel;
	private int accountId;
	
	private int championMasteryScore;
	
	private League league;
	
	public Summoner(long id, String name, int profileIconId, String revisionDate, int summonerLevel){
		this.id = id;
		this.name = name;
		this.profileIconId = profileIconId;
		this.revisionDate = revisionDate;
		this.summonerLevel = summonerLevel;
	}
	
	
	//---------- Getters ----------//
	
	public long getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getProfileIconId(){
		return this.profileIconId;
	}
	
	public String getRevisionDate(){
		return this.revisionDate;
	}
	
	public int getSummonerLevel(){
		return this.summonerLevel;
	}
	
	public int getAccountId(){
		return this.accountId;
	}
	
	public int getChampionMasteryScore(){
		return this.championMasteryScore;
	}
	
	public League getLeague(){
		return this.league;
	}
	
	
	//---------- Setters ----------//
	
	public void setChampionMasteryScore(int score){
		this.championMasteryScore = score;
	}
	
	public void setLeague(League res1){
		this.league = res1;
	}
	
	/**
	 * Summoner toString
	 */
	public String toString(){
		return this.name;
	}
	
}
