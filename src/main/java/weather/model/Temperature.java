package weather.model;


/**
 * Model for Temperature returned in Weather query
 * @author Praveen
 *
 */
public class Temperature {
	private double currentTemperature;
	private double minTemperature;
	private double maxTemperature;
	private int pressure;
	private int humidity;
	
	public Temperature(double currentTemperature, double minTemperature, double maxTemperature,
			int pressure, int humidity) {
		this.currentTemperature = currentTemperature;
		this.minTemperature = minTemperature;
		this.maxTemperature = maxTemperature;
		this.pressure = pressure;
		this.humidity = humidity;
	}
	public double getCurrentTemperature() {
		return currentTemperature;
	}
	public void setCurrentTemperature(double currentTemperature) {
		this.currentTemperature = currentTemperature;
	}
	public double getMinTemperature() {
		return minTemperature;
	}
	public void setMinTemperature(double minTemperature) {
		this.minTemperature = minTemperature;
	}
	public double getMaxTemperature() {
		return maxTemperature;
	}
	public void setMaxTemperature(double maxTemperature) {
		this.maxTemperature = maxTemperature;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
}
