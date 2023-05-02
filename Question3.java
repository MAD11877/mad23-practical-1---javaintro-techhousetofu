import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a whole number: ");
    int integer = in.nextInt();

    // Calculate & print
    int result = integer*integer;
    System.out.format("Your result is %d. %n", result);
    in.close();
    
  }
}
