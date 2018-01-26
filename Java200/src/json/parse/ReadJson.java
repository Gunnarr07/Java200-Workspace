package json.parse;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ReadJson {
    public String readSync() throws IOException {
    	String sURL = "http://freegeoip.net/json/"; //just a string

        // Connect to the URL using java's native library
        URL url = new URL(sURL);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from gson
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
//        zipcode = rootobj.get("zip_code").getAsString(); //just grab the zipcode
        return rootobj.toString();
    }
    
    public static void main(String[] args) {
		ReadJson readJson = new ReadJson();
		try {
			System.out.println(readJson.readSync());
			Gson gson = new Gson();
			Info info = gson.fromJson(readJson.readSync(), Info.class);
			
			System.out.println("\n----From Class After Parsing Json----");
			System.out.println("City: " + info.getCity());
			System.out.println("CountryCode: " + info.getCountryCode());
			System.out.println("Country Name: " + info.getCountryName());
			System.out.println("IP : " +info.getIp());
			System.out.println("Metro Code: " + info.getMetroCode());
			System.out.println("Region Code: " + info.getRegionCode());
			System.out.println("Region Name: " + info.getRegionName());
			System.out.println("Time Zone: " + info.getTimeZone());
			System.out.println("Zip Code: " + info.getZipCode());
			System.out.println("Latitude: " + info.getLatitude());
			System.out.println("Longitude: " + info.getLongitude());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
