import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.util.*;
public class SwingCounter1 extends JFrame{
	private JLabel jlcel;
	private JLabel text;
	private JLabel jlfah;
	private JTextField jtfcel;
	private JTextField jtffah;
    private double celcius;
    private double fahrenheit;
    private JPanel p,p1;
    private JButton jbcon;
	public SwingCounter1(){
		//create component
		jlcel = new JLabel("celcius");
		jlfah = new JLabel("fahrenheit");
		jtfcel= new JTextField(10);
		jtffah= new JTextField(10);
		jbcon = new JButton("Converter");
        text = new JLabel("Converter Temperature");
        p1 = new JPanel();
		p = new JPanel();
		p.setLayout(new GridLayout(2,2));
		p1.setLayout(new FlowLayout());
        p1.add(jbcon);
		//create contentpane
		Container c = getContentPane();
		//setlayout
		c.setLayout(new BorderLayout());  
		//add component
		p.add(jlcel);
		p.add(jtfcel);
		p.add(jlfah);
		p.add(jtffah);
		jtffah.setEditable(false);
		c.add(p1,BorderLayout.SOUTH);
		c.add(p,BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
		jbcon.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
            try{
            	celcius = Double.parseDouble(jtfcel.getText());
				fahrenheit = (celcius*1.8)+32;
				jtffah.setText(""+fahrenheit);
            }
			
		   catch (NumberFormatException ex) {
           System.out.println("Enter whole numbers only, with no spaces or other characters");
            
            }
		    }
		});}

		public static void main(String[] args) {
			SwingCounter1 x= new SwingCounter1();
		}}