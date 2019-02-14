package se.lexicon.simon.golf_assignment;

import java.util.Scanner;

public class Golf_Assignment {

	public static void main (String[]args) {
		
		double goal = 0;
		double position = 450;
		
		int swing = 0;
		int maxSwing = 7;
		
		double givenangle = 0;
		double givenvelocity = 0;
		
		boolean isRunning = true;
		boolean innerLoop = true;

		System.out.println("distance to goal:" + position);
		System.out.println("Max Tries :" + maxSwing);
		
		while (isRunning) {
			
			System.out.print("Enter Angle of swing: ");
			givenangle = getInterger();

			
			System.out.print("Enter Velocity of swing: ");
			givenvelocity = getInterger();

			while (innerLoop) {
				if (givenangle <= 0 || givenangle >= 90) {
					System.out.println("Angle invalid must be between 1-89°");
					System.out.print("Enter Angle of swing: ");
					givenangle = getInterger();
				} 
				else if (givenvelocity <= 0 || givenvelocity >= 94) {
					System.out.println("Velocity invalid must be between 1-93");
					System.out.print("Enter Velocity of swing: ");
					givenvelocity = getInterger();
				} else
					innerLoop = false;
			}

			innerLoop = true;
			position = calculateDistance(position, givenangle, givenvelocity);
			position = Math.round(position);
			position = Math.abs(position);
			
			swing++;
		if(position <= 10)
				position = 0;
			
			System.out.println("distance to goal:" + position);
			System.out.println("Swings done: " + swing);

			if (position == goal) {
				System.out.println("You Made It, Congratulations!");
				isRunning = playAgain();
				position = 450;
				swing = 0;
			} else if (position > 450) {
				System.out.println("The Ball Have Traveled Of The Course");
				isRunning = playAgain();
				position = 450;
				swing = 0;
			} else if (swing >= maxSwing) {
				System.out.println("Sorry, To Many Tries");
				isRunning = playAgain();
				position = 450;
				swing = 0;
			}
		}
	}
	
//__________________________________________________________________________________________________________________
	
	public static boolean playAgain () {
		System.out.println("Try again?");
		System.out.print("Y/N: ");
		
		String userInput = getStringFromUser().toUpperCase();
		
		switch (userInput) {
		case "Y":			
			return true;
			
		default:
			return false;
		}
		
	}
	
	public static double calculateDistance (double position, double givenangle, double givenvelocity) {
		double distance = calculateHit(givenangle, givenvelocity);
		position = position - distance;
			
		return position;
		
	}
		
	public static double calculateHit (double angle, double velocity) {
		double gravity = 9.8;
		double angleInRadians = (Math.PI / 180) * angle;
		double distance = Math.pow(velocity, 2.0) / gravity * Math.sin(2 * angleInRadians);
		
		return distance;
	}
	
//________________________________________________________________________________________________________________
	
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
