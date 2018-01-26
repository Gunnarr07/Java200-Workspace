package firday;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class SystemProperties {
	public static Properties systemProperties;
	public static TreeMap<String, String> systemPropertiesMap;
	
	static {
		systemProperties = System.getProperties();
		systemPropertiesMap = new TreeMap(systemProperties);
	}
	
	public static void main(String[] args) {
		System.out.println(systemProperties);
		System.out.println("\n---------------");
		systemProperties.list(System.out);
		
		System.out.println("\n----Map----");
		System.out.println(systemProperties);
		
		// Find all properties with path in the key
		System.out.println("\n----Path Props----");
		for (String key : systemPropertiesMap.keySet()) {
			if (key.toLowerCase().contains("path")) {
				System.out.printf("%s = %s %n", key, systemProperties.get(key));
			}
		}
		
		// Differ way but same output from above
		System.out.println("\n----Path Props----Different Way");
		for (Map.Entry<String, String> entry : systemPropertiesMap.entrySet()) {
			if (entry.getKey().toLowerCase().contains("path")) {
				System.out.printf("%s = %s %n", entry.getKey(), entry.getValue());
			}
		}
	}
}
