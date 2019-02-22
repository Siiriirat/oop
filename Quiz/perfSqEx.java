 
import java.lang.*;
import java.util.Scanner;
 
public class perfSqEx {
 
 
 
 
   public static void main(String args[] ) {

   Scanner in= new Scanner(System.in);
   double number = 0;
   double a = 0;
   boolean square = true;
   boolean correct = false;
   System.out.println("Enter positive number: ");
   try {
    number = in.nextDouble();
   if (number > 0)
    correct = true;
    System.out.println("eiei");
   }catch (Exception exception) {
    if (number < 0)
    System.out.println("eiedsi");
 
   }
 
  
 
}
}