import java.util.Scanner;
import java.io.File;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
public class Exception2 {
  public static void main(String[] args) {
    int total = 0;
    int num = 0;
    File myFile = null;
    Scanner inputFile = null;
   try{
    myFile = new File("inFile.txt");
    inputFile = new Scanner(myFile);
    while (inputFile.hasNext())  {
      try {
       num = inputFile.nextInt();
       total += num;
      }
      catch (InputMismatchException ime) {
           System.out.print("Illegal value found");
           inputFile.next();
      }
   }
    System.out.println("The total value is " + total);
  }
  catch (FileNotFoundException fnf){
  System.out.println("The total value is " + total);  
  System.out.println(fnf.getMessage());
  }
 }
}
