import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
 
public class NumsIntoArrayHandled1 {
 
  public static void main(String[] args) {
    final int MAX = 3;
    final int SENTINEL = 0;
 
    int nums[] = new int[MAX];
    Scanner keyboard = new Scanner(System.in);
 
    int how_many = 0;
    while (true) {
      System.out.format("enter integer (%s to stop): ", SENTINEL);
      int val;
 
      try {
        val = keyboard.nextInt();
      }
      catch (InputMismatchException ex) {
        System.err.println("-- integer not entered");
        keyboard.nextLine();     // skip the line
        //keyboard.skip(".*");   // regex alternative
        continue;
      }
 
      if (val == SENTINEL) {
        break;
      }
 
      nums[how_many++] = val;
 
      if (how_many == MAX) {
        System.out.println("Enough already!");
        break;
      }
    }
 
    System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, how_many)));
  }
}