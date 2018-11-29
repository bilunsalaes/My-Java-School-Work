
// Michael Martin
// M4A1 Programming Assignment 4

// Imports that may not have been used.
import java.util.Scanner;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;

// The required class for the assignment
public class TestAutomobiles {

	// Main method
	public static void main(String[] args) {

		// Main variables for this method. Everything that needs to be initialized is
		// so.
		Scanner input = new Scanner(System.in);
		boolean toQuit = false;
		int autoID = 0;
		String make = null;
		String model = null;
		String color = null;
		int year = 0;
		int vinNumber = 0;
		double milesPerGallon = 0;
		int speed = 0;
		int brake = 0;
		double time = 0;
		double distance = 0;

		// I purposefully created a loop that cannot naturally quit but the loop should
		// be able to break.
		while (!toQuit) {
			// This informs the user the tester what to expect to input.
			System.out.println("Please enter the autoID, make, model, color, year, vinNumber, milesPerGallon. "
					+ "your automobile's test speed and test braking power.  Press enter to continue. ");
			input.nextLine();
			// Inputs for the assignment. I am keeping Vin numbers as an Int but I realize
			// that they may have letters so technically could be strings.
			// For this exercise I don't think that it matters.
			System.out.print("\nPlease enter your auto ID >> ");
			autoID = input.nextInt();
			System.out.println("\nYou have entered " + autoID + " as your Auto ID. ");
			input.nextLine();
			System.out.println("\nPlease enter your automobile's make >> ");
			make = input.nextLine();
			System.out.println("\nYou have entered " + make + " as your make. ");
			// input.nextLine();
			System.out.println("\nPlease enter your automobile's model >> ");
			model = input.nextLine();
			System.out.println("\nYou have entered " + model + " as your model. ");
			// input.nextLine();
			System.out.println("\nPlease enter your automobile's color >> ");
			color = input.nextLine();
			System.out.println("\nYou have entered " + color + " as your color. ");
			// input.nextLine();
			System.out.println("\nPlease enter your automobile's year >> ");
			year = input.nextInt();
			System.out.println("\nYou have entered " + year + " as your year. ");
			// input.nextLine();
			System.out.println("\nPlease enter your automobile's vin number >> ");
			vinNumber = input.nextInt();
			System.out.println("\nYou have entered " + vinNumber + " as your vin number. ");
			// input.nextLine();
			System.out.println("\nPlease enter your automobile's miles per gallon.  Decimals are allowed >> ");
			milesPerGallon = input.nextDouble();
			System.out.println("\nYou have entered " + milesPerGallon + " as your miles per gallon. ");
			// input.nextLine();
			System.out.println("\nPlease enter your automobile's test speed value as an int >> ");
			speed = input.nextInt();
			System.out.println("\nYou have entered " + speed + " as your test speed. ");
			System.out.println("\nHow many seconds would you like to run this test?");
			time = input.nextInt();
			System.out.println(
					"It will take you " + (speed * time) + " seconds to reach max speed with this automobile.");

			Automobile automobile = new Automobile(autoID, make, model, color, year, vinNumber, milesPerGallon, speed,
					brake, time, distance);

			// I realize this is better done in its own method and to refactor it properly
			// and call them as methods. However after many hours toying with it,
			// and failing miserably, I went with the "technically correct" for the
			// assignment approach. What I really wanted to do was give you an option
			// as soon as you ran thr program to either A. input data B. test speed
			// variables or C. test brake variables.

			// Speed Up loop. I created this in the loop because at the level I am now, I do
			// not know of another way to test it properly.
			for (int i = 0; i < 10; i++) {
				if (i >= 0 && i <= 10000)
					automobile.speedUp(i);
				System.out.println();
				System.out.println("\nThe " + year + " " + color + " " + make + " " + model + " is speeding up ");
				System.out.println(automobile.getSpeed() + speed);
			}
			System.out.println("\nPlease enter your automobile's test braking power as an int >> ");
			brake = input.nextInt();
			System.out.println("\nYou have entered " + brake + " as your test braking power. ");
			input.nextLine();
			System.out.println("\nHow many seconds would you like to run this test?");
			time = input.nextInt();
			System.out.println("It will take you " + (speed * time) + " seconds completely stop with those brakes.");

			// // This is the brake test loop. I nested it within the while loop in the
			// constructor. I'd like to say nesting these in the constructor made sense
			// so you would know that if you don't like the brake and accelerator variables
			// your car has, you can give them new ones. But no, it's lack of skill.

			for (int i = 0; i < 10; i++) {
				if (i > 0 && i <= 10000)
					automobile.brake(i);
				System.out.println("\nThe " + year + " " + color + " " + make + " " + model + " is slowing down ");
				System.out.println(automobile.getSpeed() + speed); // I think this is where I can make adjustments
			}

			// Automobile made through the above constructor. By putting this in a while
			// loop it will be created with the correct parameters and the
			// user will be able to test the brakes / gas, as well as keep inputting data
			// until he's tired.

			input.nextLine();

			// This confirms to the user what the object that he has built. I spared him the
			// gritty details of the vin number and auto ID. However
			// these details are easy to add.

			System.out.println("\nThe year, make and model of your car is a " + year + " " + make + " " + model + " ");

			// This should break the loop if the user is done inputting data. Otherwise the
			// user can press enter to continue.
			System.out.println(
					"\nThank you for testing my program. If you would like to quit press 'q'. Otherwise press 'enter' to input another automobile.  Thank you. ");
			if (input.nextLine().equals('q') || input.nextLine().equals('Q'))
				;
			System.out.println("\nThank you for testing. ");
			break;

		}

	}

}
