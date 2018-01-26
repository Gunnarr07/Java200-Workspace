package json.parse;

import com.google.gson.annotations.SerializedName;

public class Info {
	private String ip;
	
	@SerializedName("country_code")
	private String countryCode;
	
	@SerializedName("country_name")
	private String countryName;
	
	@SerializedName("region_code")
	private String regionCode;
	
	@SerializedName("region_name")
	private String regionName;
	
	private String city;
	
	@SerializedName("zip_code")
	private String zipCode;
	
	@SerializedName("time_zone")
	private String timeZone;
	
	private Double latitude;
	
	private Double longitude;
	
	@SerializedName("metro_code")
	private int metroCode;

	public String getIp() {
		return ip;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public String getCity() {
		return city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public int getMetroCode() {
		return metroCode;
	}
}
