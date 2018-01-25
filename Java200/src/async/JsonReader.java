package async;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonReader {
	
	public Callable<String> readAsync() {
		return new Callable<String>() {
			public String call() throws Exception {
		    	String sURL = "http://freegeoip.net/json/"; //just a string

		        // Connect to the URL using java's native library
		        URL url = new URL(sURL);
		        HttpURLConnection request = (HttpURLConnection) url.openConnection();
		        request.connect();

		        // Convert to a JSON object to print data
		        JsonParser jp = new JsonParser(); //from gson
		        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
		        JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object. 
//		        zipcode = rootobj.get("zip_code").getAsString(); //just grab the zipcode
		        return rootobj.toString();
			}
		};
	}
	
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
}
