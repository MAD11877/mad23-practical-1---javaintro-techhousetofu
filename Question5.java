import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    // User input
    Scanner in = new Scanner(System.in);
    System.out.print("How many numbers would you like to enter: ");
    int num = in.nextInt();

    // Array (eg. [2, 1, 3, 4, 3])
    int num_arr[] = new int[num];
    for (int i = 0; i < num; i++) {
      System.out.format("No. %d: ", i+1);
      int n = in.nextInt();
      num_arr[i] = n;
    }

    // Loop
    int count, max_count = 0, mode = 0;
    for (int j = 0; j < num_arr.length; j++) {
      count = 0;
      for (int k = 0; k < num_arr.length; k++) {
        if (num_arr[j] == num_arr[k]) {
          count += 1;
        }
      }
      if (count > max_count) {
        mode = num_arr[j];
        max_count = count;
      }
    }

    // Print mode
    System.out.println("Highest Frequency (mode): "+mode);

    in.close();
    
  }
}
