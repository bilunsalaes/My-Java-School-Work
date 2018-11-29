
// Michael Martin
// M4A1 Programming Assignment 4
// These are the imports
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import java.util.*;

public class Automobile {

	// This is the constructor that takes the information directly from the
	// constructor in the TestAutomobile class.

	public Automobile(int autoID, String make, String model, String color, int year, int vinNumber,
			double milesPerGallon, int speed, int brake, double time, double distance) {
		// These are my variables. If I understand my studies correctly, the
		// "setVariable(variable);" should be used for while loop checks.
		setAutoID(autoID);
		this.make = make;
		this.model = model;
		this.color = color;
		setYear(year);
		setVinNumber(vinNumber);
		setMilesPerGallon(milesPerGallon);
		setSpeed(speed);
		this.brake = brake;

	}

	// Private Fields
	private int autoID;
	private String make;
	private String model;
	private String color;
	private int year;
	private int vinNumber;
	private double milesPerGallon;
	private int speed;
	private int brake;
	private double time;
	private double distance;

	// Public Fields

	Scanner input = new Scanner(System.in);

	// Get values
	public int getAutoID() {
		return autoID;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	public int getVinNumber() {
		return vinNumber;
	}

	public double getMilesPerGallon() {
		return milesPerGallon;
	}

	public int getSpeed() {
		System.out.println("You are going the following miles per hour ");
		return this.speed;
	}

	public int getBrake() {
		System.out.println("\nYou are going " + this.speed + " mph");
		return this.brake;
	}

	public double getTime() {
		return time;
	}

	public double getDistance() {
		return distance;
	}

	public Scanner scan = new Scanner(System.in);

	// This is the automobile that you just input.

	// Set values Below

	public void setAutoID(int autoID) {

		while (autoID <= -1 || autoID >= 10000) {
			System.out.println("Please enter a valid auto ID that is between 1-9999.");
			autoID = input.nextInt();
		}
		this.autoID = autoID;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setYear(int year) {
		while (year <= 1999 || year >= 2018) {
			System.out.println("Please enter a valid year between 2000 and 2017.");
			year = input.nextInt();
		}
		this.year = year;
	}

	public void setVinNumber(int vinNumber) {
		this.vinNumber = vinNumber;
	}

	public void setMilesPerGallon(double milesPerGallon) {

		while (milesPerGallon <= 9 || milesPerGallon >= 61) {

			System.out.println("\nPlease enter a valid miles per gallon between 10 and 60.");
			milesPerGallon = input.nextDouble();
		}
		this.milesPerGallon = milesPerGallon;
	}

	public void setSpeed(int speed, double time) {
		double distance = this.speed * this.time;
	}

	public void setSpeed(int speed) {

		if (speed <= 1 && speed <= 4) {
			System.out.println("\n You tapped the throttle rather softly");
			if (speed >= 5 && speed <= 7) {
				System.out.println("\n This is a normal rate of speed.");
				if (speed >= 8 && speed <= 10) {
					System.out.println("\n I feel that you may have a lead foot.");
					if (speed >= 10) {

					}
				}
				this.speed = speed;
			}

		}

	}

	public void setBrake(int brake) {
		if (brake <= 1 && brake <= 4) {
			System.out.println("\n You tapped the brake rather softly");
			if (brake >= 3 && brake <= 7) {
				System.out.println("\n This is a normal rate of braking power.");
				if (brake >= 8 && brake <= 10) {
					System.out.println("\n I feel that you may have just caused yourself whiplash.");
				}

				{
					this.brake = brake;
				}
			}
		}
	}

	public void setBrake(int speed, double time) {
		double distance = this.speed * this.time;

	}

	// Methods for overloading Speed Up and Braking

	public void setDistance() {
		this.distance = distance;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public void speedUp(int speed) {
		this.speed += 5;
	}

	public void brake(int brake) {
		this.speed -= 5;
	}

	public double speedUp(int speed, double time) {
		this.speed += 5;
		return (speed * time);
	}

	public double brake(int speed, double time) {
		this.speed -= 5;
		return (speed * time);

	}

}
