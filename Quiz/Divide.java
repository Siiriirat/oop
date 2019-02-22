import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Divide{
	public static void main(String[] args) {
		double x = 2;
		double y ;
		try{
			y = 1/x;
			System.out.println(y);
		}
		catch (ArithmeticException e) {
			System.out.println("is not 0");
		}
	}
}