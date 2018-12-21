package se.lexicon.simon.golf_assignment;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Golf_Assignment_Test {
	
	@Test
	public void test_distance() {
		double givenAngle = 45;
		double givenVelocity = 56;
		
		double expectedDistance = 320;
		
		assertEquals(expectedDistance, Golf_Assignment.calculateDistance(givenAngle, givenVelocity), 0);
	}
	
//	@Test
//	public void test_angleValid_89_and_1() {
//		double highestAngle = 89;
//		double lowestAngle = 1;
//		
//		assertTrue(Golf.angleValid(lowestAngle) & Golf.angleValid(highestAngle));
//	}
//	
//	@Test
//	public void test_badValues_return_false() {
//		double badvalueLow = 0;
//		double badValueHigh = 90;
//		
//		assertFalse(Golf.angleValid(badvalueLow) & Golf.angleValid(badValueHigh));
//	}
}