package firday;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public static void main(String[] args) {
		// create properties in memory and set a few key/values
		Properties settings = new Properties();
		settings.setProperty("gui.font","Courier New");
		settings.setProperty("gui.bgcolor","HH0000");
		try {
			// store the properties on disk
			FileOutputStream settingsOutStream = new FileOutputStream("settings.properties");
			settings.store(settingsOutStream,"header comment");
			// a date time comment will be added under your comment
			
			// add a property that will not be stored
			settings.setProperty("TEMP.STRING","will not be saved");
			settings = new Properties();
			
			// read the file from disk
			FileInputStream settingsInStream = new FileInputStream("settings.properties");
			settings.load(settingsInStream);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println(settings + "\n");
		settings.list(System.out);
	}
}
