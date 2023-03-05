package planets1;

import java.awt.Color;

public class SolarObject {

	private Coordinate coordinate;
	private String name;
	private int size;
	private Color color;

	public SolarObject(String name, int size, Color color) {
		//no setting of coordinate here, so remember to do it manually in main after initializing
		this.name = name;
		this.size = size;
		this.color = color;
	}


	public Coordinate getCoordinate() {
		return coordinate;
	}
	
	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	

}
