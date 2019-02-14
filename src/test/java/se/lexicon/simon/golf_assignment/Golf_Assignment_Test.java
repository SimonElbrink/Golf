package se.lexicon.simon.golf_assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class Golf_Assignment_Test {
	
	@Test
	public void test_distance() {
		double givenAngle = 45;
		double givenVelocity = 56;
		
		double expectedDistance = 320;
		
		assertEquals(expectedDistance, Golf_Assignment.calculateHit(givenAngle, givenVelocity), 0);
	}
	
}