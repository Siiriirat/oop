// TemperatureConverter.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TemperatureConverter extends JFrame {
	private JLabel jlcel;
	private JLabel jlfah;
    private JTextField jtfcel;
    private JTextField jtffah;
    private double celcius,fahrenheit;
    public TemperatureConverter(){
    	JLabel jlcel = new JLabel("Celcius : ");
    	JLabel jlfah = new JLabel("Fahrenheit :");
    	JTextField jtfcel = new JTextField(10);
    	JTextField jtffah = new JTextField(10);
    	Container c = getContentPane();
    	GridLayout g = new GridLayout(2,2);
    	c.setLayout(g);
    	c.add(jlcel);
    	c.add(jtfcel);
    	c.add(jlfah);
    	c.add(jtffah);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setTitle("Temperature Converter");
		setVisible(true); 
        jtfcel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                celcius = Double.parseDouble(jtfcel.getText());
                fahrenheit =  (celcius*1.8)+32;
                jtffah.setText("" + fahrenheit);  
            }
        });
        jtffah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fahrenheit = Double.parseDouble(jtffah.getText());
                celcius =  (fahrenheit-32) / 1.8;
                jtfcel.setText("" + celcius);
            }
        });
    }
 
}