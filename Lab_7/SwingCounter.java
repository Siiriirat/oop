// SwingCounter.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingCounter extends JFrame{
	private JLabel jlCounter;
	private JTextField jtfCount;
	private JButton jbCount;
	private int count = 0;
	public SwingCounter(){
		jlCounter = new JLabel("Counter");
		jtfCount  = new JTextField("0",10);
		jbCount   = new JButton("Count");
		Container c = getContentPane();
		FlowLayout fl = new FlowLayout();
		c.setLayout(fl);
		c.add(jlCounter);
		c.add(jtfCount);
		c.add(jbCount);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,100);
		setTitle("Swing Counter");
		setVisible(true); 
        jbCount.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent a){
        		count++;
                jtfCount.setText(count + "");
        	}
        });
	}
	

}