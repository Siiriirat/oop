// GuiComponents.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GuiComponents extends JFrame{
      private JButton jbbutton;
      private JCheckBox jcbcheck1;
      private JLabel jllabel;
      private JCheckBox jcbcheck2;
      private JTextField jtftext;
      private JTextArea jtatext;
      private JComboBox jcbchoice;
      private JList jllist;
      private JRadioButton jrbcheck1,jrbcheck2,jrbcheck3;
      private JPanel p1,p2;
      private JScrollPane jspane;
     
      private String[] combo  = {"Yes","No"};
      public GuiComponents(){
      p1 = new JPanel(new FlowLayout());
      p2 = new JPanel(new FlowLayout());
      jbbutton = new JButton("Button");
      jcbcheck1 = new JCheckBox();
      jllabel = new JLabel("Label");
      jcbcheck2 = new JCheckBox();
      jtftext = new JTextField("Text Field");
      jtatext = new JTextArea("Text Area",5,15);
      
      String[] mylist = {"item1","item2","item3","item4","item5","item6","item7","item8","item9","item10"};
      jllist = new JList(mylist);
      jspane = new JScrollPane(jllist);
      
      jcbchoice = new JComboBox(combo);
      jrbcheck1 = new JRadioButton("often");
      jrbcheck2 = new JRadioButton("sometime");
      jrbcheck3 = new JRadioButton("never");
      p1.add(jbbutton);
      p1.add(jcbcheck1);
      p1.add(jllabel);
      p1.add(jcbcheck2);
      p1.add(jtftext);
      p1.add(jtatext);
      p2.add(jspane);
      p2.add(jcbchoice);
      p2.add(jrbcheck1);
      p2.add(jrbcheck2);
      p2.add(jrbcheck3);
      Container c = getContentPane();
      c.setLayout(new BorderLayout());
	c.add(p1,BorderLayout.NORTH);
      c.add(p2,BorderLayout.CENTER);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(450,300);
      setTitle("GuiComponents");
      setVisible(true); 
	}
}