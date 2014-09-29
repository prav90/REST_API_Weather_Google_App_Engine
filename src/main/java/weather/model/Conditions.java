package weather.model;
import weather.enums.WeatherConditions;


/**
 * Model for Weather Conditions returned in Weather query
 * @author Praveen
 *
 */
public class Conditions {
	private WeatherConditions condition;
	private String description;
	private int id;
	private String icon;
	public Conditions(WeatherConditions condition, String description, int id, String icon) {
		this.condition = condition;
		this.description = description;
		this.id = id;
		this.icon = icon;
	}
	public WeatherConditions getCondition() {
		return condition;
	}
	public void setCondition(WeatherConditions condition) {
		this.condition = condition;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
}
