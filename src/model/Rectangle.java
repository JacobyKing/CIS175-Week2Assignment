/**
 * @author jacoby - jking11@dmacc.edu
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
package model;

public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		super();
		setWidth(width);
		setLength(length);
	}

	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double calculateArea() {
		return width * length;
	}
	
	public double calculatePerimeter() {
		return 2 * (width + length);
	}
}
