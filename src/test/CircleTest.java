/**
 * @author jacoby - jking11@dmacc.edu
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Circle;

public class CircleTest {
	Circle testCircle = new Circle(2.8);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateArea() {
		assertEquals(24.63, testCircle.calculateArea(), 0.01);
	}
	
	@Test
	public void testCalculateCircumference() {
		assertEquals(17.59, testCircle.calculateCircumference(), 0.01);
	}
	
	@Test
	public void testIsLargerThanBaseball() {
		assertTrue(testCircle.largerThanBaseball());
	}
	
	@Test
	public void testIsNotLargerThanBaseball() {
		testCircle.setRadius(1.4);
		assertFalse(testCircle.largerThanBaseball());
	}
}
