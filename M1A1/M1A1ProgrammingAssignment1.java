//@author Michael Martin 
//The public classes of my assignments are named after the course I am taking.
import java.util.Scanner;
public class M1A1ProgrammingAssignment1
{
public static void main(String[] args)
{
//For this assignment I want to use doubles for every input.    
double bottomArea;
double radius;
double cylinderVolume;
double length;
double cylinderArea;
//It's necessary to be able to input two separate values.
Scanner input = new Scanner(System.in);
System.out.print("Please enter the radius >> ");
radius = input.nextDouble();
System.out.print("Please enter the length >> ");
length = input.nextDouble();
//The next three lines I input the equations necessary for the assignment.
bottomArea = radius * radius * 3.14;
cylinderVolume = bottomArea * length;
cylinderArea = (2 * radius * 3.14 *  +  2 * bottomArea);
//The next three outputs give us the required values.
System.out.printf("The bottom area of the cylinder is %.2f", + bottomArea);
System.out.printf("The cylinder volume is %.2f", + cylinderVolume);
System.out.printf("The area of the cylinder is %.2f", + cylinderArea);
}
    
}    