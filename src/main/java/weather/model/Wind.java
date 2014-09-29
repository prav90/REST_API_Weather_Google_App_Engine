package weather.model;
/**
 * Model for wind returned in Weather query
 * @author Praveen
 *
 */
public class Wind {
	double speed;
	double degree;
	
	public Wind(double speed, double degree) {
		this.speed = speed;
		this.degree = degree;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getDegree() {
		return degree;
	}

	public void setDegree(double degree) {
		this.degree = degree;
	}
	
}
