package weather.model;

/**
 * Model for Coordinates returned in Weather query
 * @author Praveen
 *
 */
public class Coordinates {
	private double longitude;
	private double latitude;
	
	// construct the object
	public Coordinates(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	/*
	 * Getters and Setters
	 */
	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
}
