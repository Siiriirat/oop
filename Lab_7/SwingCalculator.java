// SwingCalculator.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingCalculator extends JFrame implements ActionListener{
	private JButton jbone,jbtwo,jbthree,jbfour,jbfive,jbsix,jbseven,jbeight,jbnine,jbzero,jbplus,jbminus,jbmul,jbdiv,jbequal,jbclear;
	private JPanel  panel;
	private JTextField jtfshow;
	private int num1=0,num2=0,result=0;
	public SwingCalculator(){
		jbone   = new JButton("1");
		jbtwo   = new JButton("2");
		jbthree = new JButton("3");
		jbfour  = new JButton("4");
		jbfive  = new JButton("5");
		jbsix   = new JButton("6");
		jbseven = new JButton("7");
		jbeight = new JButton("8");
		jbnine  = new JButton("9");
		jbzero  = new JButton("0");
		jbequal = new JButton("=");
	    jbclear = new JButton("C");
	    jbplus  = new JButton("+");
	    jbminus = new JButton("-");
	    jbmul	= new JButton("*");
	    jbdiv   = new JButton("/");
	    jtfshow = new JTextField(10);
	    panel = new JPanel();
	    panel.setLayout(new GridLayout(4,4));
	    panel.add(jbseven);
	    panel.add(jbeight);
	    panel.add(jbnine);
	    panel.add(jbplus);
	    panel.add(jbfour);
	    panel.add(jbfive);
	    panel.add(jbsix);
	    panel.add(jbminus);
	    panel.add(jbone);
	    panel.add(jbtwo);
	    panel.add(jbthree);
	    panel.add(jbmul);
	    panel.add(jbclear);
	    panel.add(jbzero);
	    panel.add(jbequal);
	    panel.add(jbdiv);
	    jtfshow.setEditable(false);
	    jbclear.addActionListener(this);
	    jbone.addActionListener(this);
	    jbtwo.addActionListener(this);
	    jbthree.addActionListener(this);
	    jbfour.addActionListener(this);
	    jbfive.addActionListener(this);
	    jbsix.addActionListener(this);
	    jbseven.addActionListener(this);
	    jbeight.addActionListener(this);
	    jbnine.addActionListener(this);
	    jbzero.addActionListener(this);
	    jbplus.addActionListener(this);
	    jbmul.addActionListener(this);
	    jbminus.addActionListener(this);
	    jbdiv.addActionListener(this);
	    jbequal.addActionListener(this);
	    Container c = getContentPane();
	    c.setLayout(new BorderLayout());
	    c.add(jtfshow,BorderLayout.NORTH);
	    c.add(panel,BorderLayout.CENTER);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setTitle("Swing Calculator");
		setVisible(true); 
	}
	public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbone)
           jtfshow.setText(jtfshow.getText()+ "1");
        else if(e.getSource() == jbtwo)
           jtfshow.setText(jtfshow.getText()+ "2");	        
        else if(e.getSource() == jbthree)
           jtfshow.setText(jtfshow.getText()+ "3");		  
        else if(e.getSource() == jbfour)
           jtfshow.setText(jtfshow.getText()+ "4");		  
        else if(e.getSource() == jbfive)
           jtfshow.setText(jtfshow.getText()+ "5");  
        else if(e.getSource() == jbsix)
           jtfshow.setText(jtfshow.getText()+ "6");
        else if(e.getSource() == jbseven)
           jtfshow.setText(jtfshow.getText()+ "7");
        else if(e.getSource() == jbeight)
           jtfshow.setText(jtfshow.getText()+ "8");
        else if(e.getSource() == jbnine)
           jtfshow.setText(jtfshow.getText()+ "9");
        else if(e.getSource() == jbzero)
           jtfshow.setText(jtfshow.getText()+ "0");
        else if(e.getSource() == jbplus){
        	jtfshow.setText(jtfshow.getText()+ "+");
        }
        else if(e.getSource() == jbminus)
           jtfshow.setText(jtfshow.getText()+ "-");
        else if(e.getSource() == jbmul)
           jtfshow.setText(jtfshow.getText()+ "*");
        else if(e.getSource() == jbdiv)
           jtfshow.setText(jtfshow.getText()+ "/");
        else if(e.getSource() == jbclear)
           jtfshow.setText(""); //
        else if(e.getSource() == jbequal){
        	String []num = jtfshow.getText().split("[-+*/=]");
     		char opt = jtfshow.getText().charAt(num[0].length());
     		jtfshow.setText(""+opt);
            if(opt == '+')
            {
            result = Integer.parseInt(num[0])+Integer.parseInt(num[1]); 
            jtfshow.setText(""+result);
            }
            else if(opt == '-')
            {
            result = Integer.parseInt(num[0])-Integer.parseInt(num[1]); 
            jtfshow.setText(""+result);
            }
            else if(opt == '*')
            {
            result = Integer.parseInt(num[0])*Integer.parseInt(num[1]); 
            jtfshow.setText(""+result);
            }
            else if(opt == '/')
            {
            result = Integer.parseInt(num[0])/Integer.parseInt(num[1]); 
            jtfshow.setText(""+result);
            }
           
        }
   }

}