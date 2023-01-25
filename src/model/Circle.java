/**
 * @author jacoby - jking11@dmacc.edu
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
package model;

public class Circle {
	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double calculateCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public boolean largerThanBaseball() {
		if(radius > 1.45) {
			return true;
		}
		else {
			return false;
		}
	}
}
