//Michael Martin
//M5A1 Programming Assignment 5

// This is my populationFor class
public class populationFor {

	// These are the required variables for my tests to function. I wanted to use
	// the multiplier variables so we can test different rates for
	// growth and rates for decline.

	static double newPopulation;
	static double mexicoMultiplier = (1.0105);
	static double unitedStatesMultiplier = (0.9984);
	static double japanMultiplier = (1.0101);
	static int counter = 0;
	static long mexicoPopulation = (121000000);
	static long unitedStatesPopulation = (315000000);
	static long japanPopulation = (127000000);

	// Mexico's growth rate calculations and output.
	public static void mexico() {
		newPopulation = mexicoPopulation * mexicoMultiplier;
		mexicoPopulation = (long) newPopulation;
		System.out.println("\n The Mexico population is " + " " + mexicoPopulation + " this year. ");
	}

	// The United States's growth decline calculation and output.
	public static void unitedStates() {
		newPopulation = unitedStatesPopulation * unitedStatesMultiplier;
		unitedStatesPopulation = (long) newPopulation;
		System.out.println("\n The US population is " + " " + (unitedStatesPopulation) + " this year. ");
	}

	// Japan's growth rate calculation and output.
	public static void japan() {
		newPopulation = japanPopulation * japanMultiplier;
		japanPopulation = (long) newPopulation;
		System.out.println("\n The Japan population is " + " " + japanPopulation + " this year. ");
	}

	// This is the only method that needs to be called from my while loop because it
	// also contains the condition
	// to break the loop when the United State's population drops below both Mexico
	// and Japan. It will also tell us the final population count for all three
	// countries. Finally,
	// this is the better method for conducting the test because it allows each
	// method to be run in sequence in a rotation.

	public static void test() {

		for (int counter = 0; counter < 200; counter++) {
			mexico();
			unitedStates();
			japan();
			System.out.println("\n" + counter + " years have passed");
			{
				if ((unitedStatesPopulation <= mexicoPopulation) && (unitedStatesPopulation <= japanPopulation))
					break;
			}

		}
	}

}
