package lulu;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Leagues{

    private static Gson gson = new Gson();

    public static int getLeague(int id, String region) throws Exception{
		String request = "https://" + region + ".api.riotgames.com/lol/league/v3/leagues/by-summoner/" + id + "?api_key=94753ea6-ae18-4f15-bff6-7ecc63e766a5";
		String response = APIRequest.getResponse(request);
		JsonObject jsonObj = new JsonParser().parse(response).getAsJsonObject();
		
		return gson.fromJson(jsonObj, Summoner.class);
	}
    
    public static Summoner getPosition(int id, String region) throws Exception{
    	
		String request = "https://" + region + "/lol/league/v3/position/by-summoner/" + id + "?api_key=94753ea6-ae18-4f15-bff6-7ecc63e766a5";
		String response = APIRequest.getResponse(request);
		JsonObject jsonObj = new JsonParser().parse(response).getAsJsonObject();
    	return gson.fromJson(jsonObj, Summoner.class);
    }
}