package se.lexicon.simon.golf_assignment;

import java.util.Scanner;

public class Golf_Assignment {
// Normal / impossible mode ? 
	
//	Resources:
//		Algorithms:
//		Angle In Radians: (Math.PI / 180) * angle
//		Distance: Math.pow(velocity, 2) / GRAVITY * Math.sin(2 * angleInRadians)
//		Gravity is equal to 9.8
//		Tolerance is 0.1 M. (10 cm )	math.round(x * 10.0) / 10.0
//		Example: At 45 Degrees and 56 m/s, the ball should travel 320 meters.
	
//	 The player should be able to launch the golf ball from its initial location,
//	with a given angle (degrees from the ground up) and velocity (m/s at the start of the ball’s arc).

//	position = Math.abs(position);
	
	
	public static void main (String[]args) {
		
		double goal = 0;
		double Position = 450; // do i want to modifiable?
		
		int tries = 0;
		int swing;
		int totalswings;
		
		double givenangle;
		double givenvelocity;
		
		
		givenangle = 45;
		givenvelocity = 32;
		calculateDistance(givenangle, givenvelocity);
		
		public static void 
		
		if(newPosition == goal) {
			System.out.println("You Made It, Congratulations!");
			break;
		}
		else if () {
	
			System.out.println("The Ball Have Traveled Of The Course");
			break;
		}
		else if(tries >= 7){
			System.out.println("Sorry, To Many Tries");
			break;
		} 
		else {
			tries++;
			round(); //?
		}
		
	}
	
	public static double calculate (double distance, ) {
		
	}
	
	
	
	public static double calculateDistance (double angle, double velocity) {
		double gravity = 9.8;
		double angleInRadians = (Math.PI / 180) * angle;
		double distance = Math.pow(velocity, 2.0) / gravity * Math.sin(2 * angleInRadians);
		
		return distance;
	}
	
	public static double roundReportOngoing() {
		
	}
	
	public static double Scoreboard() {
		
	}
	
	
	
	public static double distanceholder( ) {
		
		String[] distancetraveld = new String[7]; //
		
	}
	
	public static void printStringArray(String [] toPrint) {
		for (String s : toPrint) {
			System.out.println(s);
		}
	}
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static String getStringFromUser () {
		return scanner.nextLine();
	}
	
	public static double getInterger() {
		boolean valid = false;
		double number = 0;
		while(!valid) {
			try {
				number = Integer.parseInt(getStringFromUser());
				valid = true;				
			}catch(NumberFormatException e) {
				System.out.println("Input was not a number");
			}
		}
		return number;
	}
}
