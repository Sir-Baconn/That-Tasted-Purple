package requests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * APIRequests class that sends the requests to Riot's API
 * @author steve
 * @author ralph
 */
public class APIRequest {
	
	/**
	 * API Key to send requests with
	 */
	public static final String API_KEY = "RGAPI-16c9d8fe-1e34-4034-90de-89fe4bb21df0";
	
	/**
	 * Send a request to Riot's API and get a JSON response
	 * @param urlToRead URL to connect to
	 * @return Parsed data as one String
	 * @throws Exception
	 */
	public static String getResponse(String urlToRead) throws Exception{
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlToRead);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line = "";
		while((line = rd.readLine()) != null){
			result.append(line);
		}
		rd.close();
		return result.toString();
	}
	
}
