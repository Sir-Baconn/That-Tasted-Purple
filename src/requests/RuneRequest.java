package requests;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import runes.Rune;

public class RuneRequest {
	
	
	private static Gson gson = new Gson();
	
	/**
	 * Creates a Rune object from the given id
	 * @param id Rune id
	 * @return Rune object
	 * @throws Exception
	 */
	public static Rune getRune(int id) throws Exception{
		String request = "https://na1.api.riotgames.com/lol/static-data/v3/runes/" + id + "?locale=en_US&api_key=" + APIRequest.API_KEY;
		String response = APIRequest.getResponse(request);
		JsonObject jsonObj = new JsonParser().parse(response).getAsJsonObject();
		
		return gson.fromJson(jsonObj, Rune.class);
	}
	
	/**
	 * Get all runes in league's collection
	 * @return
	 * @throws Exception
	 */
	
	//Currently doesn't work because "data" is an object of runes and not an array for some reason
	public static Rune[] getRuneCollection() throws Exception{
		String request = "https://na1.api.riotgames.com/lol/static-data/v3/runes?locale=en_US&api_key=" + APIRequest.API_KEY;
		String response = APIRequest.getResponse(request);
		JsonObject jsonObj = new JsonParser().parse(response).getAsJsonObject();
		
		JsonArray jArray = jsonObj.getAsJsonArray("data");
		String json = gson.toJson(jArray);
		
		return gson.fromJson(jArray, Rune[].class);
	}
	
}
