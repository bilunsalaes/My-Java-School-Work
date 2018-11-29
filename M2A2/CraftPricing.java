//Michael Martin
//IT210
import java.util.Scanner;
public class CraftPricing
{
    public static void main(String[] args)
    {
        //These are my input values
        double materials;
        double hours;
        double shipping;
        double discount;
        //Double RetailPrice;
        //String ProductName;
        
        //This will give me a new product name with each inquiry.
        //CraftyCreations ProductName = new CraftyCreations();
        //Keyboard
        
        Scanner keyboard = new Scanner(System.in);
        
        //The following are inputs for calculations
        System.out.print("Enter material cost >> ");
        materials = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Enter hours worked >> ");
        hours = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Enter additional shipping cost beyond $6 >> ");
        shipping = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Enter the name ocf the product you are interested in  >> ");
        String productName = keyboard.nextLine(); //This was a correction
        
        //The following are for calculations.  I allowed shipping to allow for increased values in case of overnight options.
        double retailPrice = calcPrice(materials, hours); //this was a correction
        //shipping = 6 + shipping;
        System.out.printf("The total cost of the "+productName+" that you are interested in, with discount, is : %.2f", +retailPrice); //lower case retaiPrice was a correction
        }
       
    /**
     * This method calculates the final price of a product, including shipping cost and discount
     * @param cost the cost of the material
     * @param hours the number of hours used to make the product 
     * @return 
     */
    private static double calcPrice(double cost, double hours) {   //This whole method was a correction
        double finalPrice = .75 * (cost + (14 * hours)) + 6;
        return finalPrice;
    }
    
    //This will call the CraftyCreations class    
    public static CraftyCreations getData(CraftyCreations s)
    {
        //These are specifically what will be called if and when needed.
        double materials;
        double hours;
        double shipping;
        String ProductName;
        return s;
        
        }
}
