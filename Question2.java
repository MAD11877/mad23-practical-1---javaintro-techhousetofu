import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    // Create Scanner object
    Scanner in = new Scanner(System.in);

    // User input
    System.out.print("Enter height (in m): ");
    double height = in.nextDouble();
    System.out.print("Enter weight (in kg): ");
    double weight = in.nextDouble();
    in.close();

    // Calculate BMI & print result
    double bmi = weight / (height * height);
    System.out.format("Your BMI is %.1f%n", bmi);
  }
}
