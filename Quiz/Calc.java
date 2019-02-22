import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Calc extends JFrame   
{
  private JTextField displayField;   
  private boolean wantNumber;
  private String prevOp;      
  private int currTotal;   
  public Calc()    
  {
    super("Swing Calculator");
    makeGUI();
    resetCalculator();
  //  pack();
    setSize(280,200);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
  }  // end of Calc()
  private void makeGUI()      
  {
    JPanel content = new JPanel();
    content.setLayout( new BorderLayout(4, 4) );
    content.setBorder(       
    BorderFactory.createEmptyBorder(10, 10, 10, 10));
    displayField = new JTextField(12);
    displayField.setHorizontalAlignment(JTextField.RIGHT);   
    content.add(displayField, BorderLayout.NORTH);
    content.add( buildButtonPanel(), BorderLayout.CENTER);
    content.add( buildOpPanel(), BorderLayout.EAST);
    content.add( buildOp1Panel(), BorderLayout.SOUTH);
    setContentPane(content);
  }  

  private JPanel buildButtonPanel()     
  {
  
    ActionListener numListener = new NumListener();

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(3, 3, 2, 2));
    String[] buttonOrder = { "7", "8", "9",
                             "4", "5", "6",
                             "1", "2", "3",};

    for (int i = 0; i < buttonOrder.length; i++) {
      JButton b = new JButton(buttonOrder[i]);
      if (buttonOrder[i].equals(" ")) {       
        b.setEnabled(false);       
        b.setVisible(false);
      }
      else  
        b.addActionListener(numListener);
      buttonPanel.add(b);
    }
    return buttonPanel;
  } 

  private JPanel buildOpPanel()   
  {
    ActionListener opListener = new OpListener();
      JPanel opPanel = new JPanel();
    opPanel.setLayout(new GridLayout(3, 1, 2, 2));

    String[] opOrder = { "+", "-", "x" };

    for (int i = 0; i < opOrder.length; i++) {
      JButton b = new JButton(opOrder[i]);
      b.addActionListener(opListener);
      opPanel.add(b);
    }
    return opPanel;
  }  
 private JPanel buildOp1Panel()     

  {
    ActionListener numListener = new NumListener();
    ActionListener opListener = new OpListener();
  
    JPanel opPanel1 = new JPanel();
    opPanel1.setLayout(new GridLayout(1, 3, 2, 2));

    String[] opOrder1 = { "c", "0", "=","/"};

    for (int i = 0; i < opOrder1.length; i++) {
      JButton b = new JButton(opOrder1[i]);
        if (opOrder1[i].equals("0")) {   
           b.addActionListener(numListener);
          opPanel1.add(b);
        }  
        else
          b.addActionListener(opListener);
         opPanel1.add(b);
    }
    return opPanel1;
            }  

  private void resetCalculator()     
  {
    wantNumber = true;   
    displayField.setText("0");
    prevOp = "=";
    currTotal = 0;
  }  
  // ------------- inner listener class ----------------
  class OpListener implements ActionListener   
  {
    public void actionPerformed(ActionEvent e)
    {
      if (wantNumber) { 
        resetCalculator();
        displayField.setText("0");
      }
      else {  
        try {      
          int val = Integer.parseInt( displayField.getText() );
          if (prevOp.equals("="))
            currTotal = val;
          else if (prevOp.equals("+"))
            currTotal += val;
          else if (prevOp.equals("-"))
            currTotal -= val;
          else if (prevOp.equals("x"))
            currTotal *= val;
          else if (prevOp.equals("/"))
            currTotal /= val;
          displayField.setText("" + currTotal);
        }
        catch (NumberFormatException ex) {
          resetCalculator();
          displayField.setText("Format Error");
        }
        catch (ArithmeticException ex) {
          resetCalculator();
          displayField.setText("Arithmetic Error");
        }     
        prevOp = e.getActionCommand();
        wantNumber = true;
      }
    } 
  }
  class NumListener implements ActionListener  
    {
    public void actionPerformed(ActionEvent e)
    {
      String digit = e.getActionCommand();                               
      if (wantNumber) {   
        displayField.setText(digit);
        wantNumber = false;
      }
      else 
        displayField.setText(displayField.getText() + digit);
    }
  } 
  // --------------------------------------------
  public static void main(String[] args)    // 5
  {  new Calc(); }
} 
