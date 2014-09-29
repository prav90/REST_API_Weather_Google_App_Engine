package weather.model;

public class WeatherResult {
	private String locationName;
	private int locationId;
	private Coordinates coord;
	private Conditions [] weatherConditions;
	private Temperature temperatureInfo;
	private Wind wind;
	
	private String errorMessage;
	
	public WeatherResult(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public WeatherResult(String locationName, int locationId, Coordinates coord,
			Conditions [] weatherCondtions, Temperature temperatureInfo, Wind wind) {
		this.locationName = locationName;
		this.locationId = locationId;
		this.coord = coord;
		this.weatherConditions = weatherCondtions;
		this.temperatureInfo = temperatureInfo;
		this.wind = wind;
	}

	public String getLocationName() {
		return locationName;
	}

	public int getLocationId() {
		return locationId;
	}

	public Coordinates getCoord() {
		return coord;
	}

	public Conditions[] getWeatherConditions() {
		return weatherConditions;
	}

	public Temperature getTemperatureInfo() {
		return temperatureInfo;
	}

	public Wind getWind() {
		return wind;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
}
