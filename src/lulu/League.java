package lulu;

public class League {
	private String leagueName;
	private String tier;
	private String queueType;
	private char rank;
	private long playerOrTeamId;
	private String playerOrTeamName;
	private int leaguePoints;
	private int wins;
	private int losses;
	private boolean veteran;
	private boolean inactive;
	private boolean freshBlood;
	private boolean hotStreak;
	
	public String getTier(){
		return this.tier;
	}
	
	public char getRank(){
		return this.rank;
	}
	
	public String toString(){
		return tier + " "+ rank;
	}
}
