import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    // User input
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = in.nextInt();

    // Print triangle
    for (int y = 0; y < num; y++){
      int stars = num - y;
      String s = "*";
      System.out.println(s.repeat(stars));
    }

    // Close scanner
    in.close();
    
  }
}
