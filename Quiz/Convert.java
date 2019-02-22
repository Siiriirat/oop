// Modulus.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Convert extends JFrame{
 private JLabel jlnum1,jlnum2,jlresult,jlshow;
 private JTextField jtfnum1,jtfnum2,jtfresult;
 private JButton jbcal;
 private double num1,num2;
 private double result;
 public Convert(){
  jlnum1 = new JLabel("First Number");
  jtfnum1 = new JTextField(5);
  jlresult = new JLabel("Result");
  jtfresult = new JTextField(5);
  jtfresult.setEditable(false);
  jbcal = new JButton("Calculate");
  jlshow =new JLabel("");
  Container c = getContentPane();
  c.setLayout(new FlowLayout());
  c.add(jlnum1);
  c.add(jtfnum1);
  c.add(jlresult);
  c.add(jtfresult);
  c.add(jbcal);
  c.add(jlshow);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(600,100);
  setVisible(true);
  jbcal.addActionListener(new ConvertListener());
 }
 private class ConvertListener implements ActionListener{
   public void actionPerformed(ActionEvent a) {
  try{
   num1 = Double.parseDouble(jtfnum1.getText());
   if(num1 < 0)
    throw new NumberException();
   result = num1 *1.609;
   jtfresult.setText(""+result);
  }
  catch(NumberException n){
   jlshow.setText("You must number > 0");
  }
 }
}
 public static void main(String[] args) {
   new Convert();
 }
}