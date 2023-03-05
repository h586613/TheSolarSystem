package planets1;

import java.awt.Color;

public class OrbitalObject extends SolarObject {

	private SolarObject centerObject;
	private int distanceFromCenter;
	private int angle = 0;
	private int frequency;
	private double period;

	public OrbitalObject(String name, int size, Color color, SolarObject centerObject,
			int distanceFromCenter, int angle, int frequency, double period) {
		super(name, size, color);
		this.centerObject = centerObject;
		this.distanceFromCenter = distanceFromCenter;
		this.angle = angle;
		this.frequency = frequency;
		this.period = period;
	}

	public void setCoordinateRelativeToCenterObject() {
		int centerX = centerObject.getCoordinate().getX();
		int centerY = centerObject.getCoordinate().getY();
		int x = (int) (centerX + distanceFromCenter * Math.cos(Math.toRadians(angle)));
		int y = (int) (centerY + distanceFromCenter * Math.sin(Math.toRadians(angle)));
		this.setCoordinate(new Coordinate(x, y));

	}

	public SolarObject getCenterObject() {
		return centerObject;
	}

	public void setCenterObject(SolarObject centerObject) {
		this.centerObject = centerObject;
	}

	public int getDistanceFromCenter() {
		return distanceFromCenter;
	}

	public void setDistanceFromCenter(int distanceFromCenter) {
		this.distanceFromCenter = distanceFromCenter;
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public double getPeriod() {
		return period;
	}

	public void setPeriod(double period) {
		this.period = period;
	}
	
	
	public void incAngle() {
		angle++;
	}
	
	

}
