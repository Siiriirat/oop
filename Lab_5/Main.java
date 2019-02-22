import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Insert Number1 : ");
        String First = Sc.nextLine();
        System.out.print("Insert Number2 : ");
        String Second = Sc.nextLine();
        System.out.println("Sum : " + (First + Second) );
       
    }
}