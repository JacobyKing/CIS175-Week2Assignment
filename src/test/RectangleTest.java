/**
 * @author jacoby - jking11@dmacc.edu
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Rectangle;

public class RectangleTest {
	Rectangle testRectangle = new Rectangle(5, 8);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateArea() {
		assertEquals(40, testRectangle.calculateArea(), 0.01);
	}
	
	@Test
	public void testCalculatePerimeter() {
		assertEquals(26, testRectangle.calculatePerimeter(), 0.01);
	}
}
