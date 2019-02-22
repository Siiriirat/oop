import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DivideByZeroTest extends JFrame implements ActionListener{
   private JTextField input1, input2,  output;
   private int number1, number2;
   private double result;
   public DivideByZeroTest(){
      super( "Demonstrating Exceptions" );
      Container c = getContentPane();
      c.setLayout( new GridLayout(3,2) );
      c.add( new JLabel( "Enter numerator ",SwingConstants.RIGHT ) );
      input1 = new JTextField(10);
      c.add( input1);
      c.add( new JLabel( "Enter denominator and press Enter ", SwingConstants.RIGHT ) );
      input2 = new JTextField(10);
      c.add( input2 );
      input2.addActionListener(this);
      c.add( new JLabel( "RESULT ",SwingConstants.RIGHT ) );
      output = new JTextField();
      c.add( output );
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(425,100);
      setVisible(true);
   } 
   public void actionPerformed( ActionEvent e ){
   	  DecimalFormat precision3 = new DecimalFormat( "0.000");
   	  output.setText( "" );         
   	  try {        
   	  	number1 = Integer.parseInt(input1.getText());
   	  	number2 = Integer.parseInt(input2.getText());
   	  	
   	  	if(number2 == 0)
   	  		throw new DivideByZeroException();
   	  	result =  number1/number2;
   	  	output.setText(  precision3.format(result) );
   	  }
      catch ( NumberFormatException nfe ) {
      	JOptionPane.showMessageDialog( this,"You must enter two integers", "Invalid Number Format",JOptionPane.ERROR_MESSAGE );
      }     
      catch ( DivideByZeroException dbze ) {
      	JOptionPane.showMessageDialog( this,dbze.toString(),"Attempted to Divide by Zero",JOptionPane.ERROR_MESSAGE );
      }
   } 
   
   	public static void main( String args[] ){  
   		new DivideByZeroTest();  
   	} 
} 