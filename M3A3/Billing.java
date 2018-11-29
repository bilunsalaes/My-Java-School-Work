//Michael Martin
//IT210

import java.util.Scanner;

class computeBill
{
	
	
	// These are my four methods that I am overloading.  
	
	// Method 1.
	public double test(double photoBookPrice)
	{
		
		double tax = .085 * photoBookPrice;
		return (photoBookPrice * 1) + tax;
		 
		
				
	}
	// Method 2.
	public double test(double photoBookPrice, int photoBookQuantity)
	{
		
		double tax = .085 * photoBookPrice * photoBookQuantity;
		return (photoBookPrice * photoBookQuantity) + tax;
		
		
		}
	
	// Method 3.
	public double test(double photoBookPrice, int photoBookQuantity, double couponValue)
	{
		
		double tax = .085 *((photoBookPrice * photoBookQuantity) - couponValue);
		return ((photoBookPrice * photoBookQuantity) - couponValue) + tax;
		
		
		}
	
	// Method 4.	
	public double test(double photoBookPrice, int photoBookQuantity, double couponValue, double weeklyDiscount)
		{
		
			
			double tax = .085 *(((photoBookPrice * photoBookQuantity) -couponValue) - weeklyDiscount);
			return (((photoBookPrice * photoBookQuantity) -couponValue) - weeklyDiscount)  + tax;
				
		
	}
	
	// This is the calculation for the total cost of all of the books with all of the discounts.
		
	
	//  The following section I could not get to work properly so I had to brute strength the taxes a different way.  I left these in as comments.
	/*
	public double totalCost(double photoBookPrice, int photoBookQuantity, double couponValue, double weeklyDiscount) 
		{  
		//double tax = .085;			
		double totalCost = (((photoBookPrice * photoBookQuantity) - couponValue) - weeklyDiscount) + tax;
		return totalCost;
				  
		}
				
	// This is how to calculate the tax.
	    public double calculateTax(double tax, double totalCost)
				{
					tax = .085 * totalCost;
					return tax;
				}*/
			

}

public class Billing 
{
	public static void main(String[] args)
	{
		// This was a recommendation by Eclipse.
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		computeBill obj = new computeBill();
		
		// Section off.
		double photoBookPrice;
		int photoBookQuantity;
		double couponValue;
		double weeklyDiscount;
		//double totalCost; - This was not used because I found another way for now through brute strength. 
		double answer1; 	
		double answer2;		
		double answer3;		 
		double answer4;		
		//double tax; 	- This was not used because I found another way for now through brute strength.	
		// Section off.
		
		//The following are inputs for calculations
		
		// This will call the method overload for calculating the cost of one book; user must input the cost.  This includes sales tax.
        System.out.print("Welcome to our photo book store.  Please enter the base price of the photo book you are interested in: >> ");
   		photoBookPrice = (double) keyboard.nextDouble();
        keyboard.nextLine();
        answer1 = obj.test(photoBookPrice);
        System.out.println("The cost of your book will be " + answer1 + " after tax.");
        
        
        // This will call the method overload for calculating the cost of x books, with sales tax included.
        System.out.print("Now, how many books you would like? >> ");
        photoBookQuantity = (int) keyboard.nextInt();
        keyboard.nextLine();
        answer2 = obj.test(photoBookPrice, photoBookQuantity);
        System.out.println("The cost of your multiple books will be " + answer2 + " after taxes. "); 
        
        
        // This will call the method overload for calculating the cost of x books, subtracting any coupons, sales tax included.
        System.out.print("Now, do you have any weekly coupons?  If so, please use dollar ammounts. >> ");
        couponValue = (double) keyboard.nextDouble();
        keyboard.nextLine();
        answer3 = obj.test(photoBookPrice, photoBookQuantity, couponValue);
        System.out.println("The cost of your books will be " + answer3 + " after taxes and discounts. ");
        
        
        // This will call the method overload for calculating the cost of x books, subtracting any coupons and weekly discounts, sales tax included.
        System.out.print("Finally, what is the store's weekly discount? >> ");
        weeklyDiscount = (double) keyboard.nextDouble();
        keyboard.nextLine();
        answer4 = obj.test(photoBookPrice, photoBookQuantity, couponValue, weeklyDiscount);
        System.out.println("The cost of your books will be " + answer4 + " after taxes and discounts.");
        
        
	}
	}
