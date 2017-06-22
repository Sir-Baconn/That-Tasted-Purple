package requests;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import lulu.Match;

public class MatchRequest{
	
	 private static Gson gson = new Gson();

	 public static Match getMatchList(int accId, String region) throws Exception{
	    	
			String request = "https://" + region + ".api.riotgames.com/lol/match/v3/matchlists/by-account/" + accId + "/recent?api_key=6c14dd62-6922-4419-8969-d149c8ab39c4";
			String response = APIRequest.getResponse(request);
			JsonObject jsonObj = new JsonParser().parse(response).getAsJsonObject();
			
			//JsonArray matches1 = jsonObj.get("matches").getAsJsonArray();
			JsonArray Jarray1 = jsonObj.getAsJsonArray("matches");
			
			String json = gson.toJson(Jarray1);
			JsonArray arr1 = new JsonParser().parse(json).getAsJsonArray();
			JsonObject jobj = arr1.get(0).getAsJsonObject();
			
			return gson.fromJson(jobj, Match.class);
	 }
}