// Modulus.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Modulus extends JFrame{
 private JLabel jlnum1,jlnum2,jlresult,jlshow;
 private JTextField jtfnum1,jtfnum2,jtfresult;
 private JButton jbcal;
 private int num1,num2;
 private double result;
 public Modulus(){
  jlnum1 = new JLabel("First Number");
  jtfnum1 = new JTextField(5);
  jlnum2 = new JLabel("Second Number");
  jtfnum2 = new JTextField(5);
  jlresult = new JLabel("Result");
  jtfresult = new JTextField(5);
  jtfresult.setEditable(false);
  jbcal = new JButton("Calculate");
  jlshow =new JLabel("");
  Container c = getContentPane();
  c.setLayout(new FlowLayout());
  c.add(jlnum1);
  c.add(jtfnum1);
  c.add(jlnum2);
  c.add(jtfnum2);
  c.add(jlresult);
  c.add(jtfresult);
  c.add(jbcal);
  c.add(jlshow);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(600,100);
  setVisible(true);
  jbcal.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent a) {
  try{
   num1 = Integer.parseInt(jtfnum1.getText());
   num2 = Integer.parseInt(jtfnum2.getText());
   if(num2 == 0)
    throw new ModulusZeroException();
   result = (double) num1/num2;
   jtfresult.setText(""+result);
  }
  catch(NumberFormatException n){
   jlshow.setText("You must Integer");
  }
  catch (ModulusZeroException m) {
   jtfresult.setText("0");
  }
    }
    });
    }
 
 public static void main(String[] args) {
  new Modulus();
 }
}