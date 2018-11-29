//Michael Martin
//M5A1 Programming Assignment 5

public class populationWhile {

	// The main method only needs to call the test method from the
	// populationFor class.
	// I may have gone a little overboard with defining my conditions for the while
	// loop but I wanted to make absolutely sure there were no bugs.

	public static void main(String[] args) {

		while ((populationFor.mexicoPopulation <= populationFor.unitedStatesPopulation)
				&& (populationFor.japanPopulation <= populationFor.unitedStatesPopulation)
				&& (populationFor.unitedStatesPopulation >= populationFor.mexicoPopulation)
				&& (populationFor.unitedStatesPopulation >= populationFor.japanPopulation))

		// I found it much easier to include the test in a for loop and run one method
		// in the while loop.
		{
			populationFor.test();

		}

		// This output statement will give us the final population counts for all three
		// countries by the end of the simulation.

		{
			System.out.println("\nThe tables have turned. " + " " + " The population for the United States is now "
					+ " " + populationFor.unitedStatesPopulation + ", the population of Mexico is now " + " "
					+ populationFor.mexicoPopulation + ", and finally the current population of Japan is " + " "
					+ populationFor.japanPopulation + ".");

		}

	}

}
