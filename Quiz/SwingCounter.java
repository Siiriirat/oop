import javax.swing.*;
import java.awt.*;

public class SwingCounter extends JFrame {
    private JLabel      jlb1 = new JLabel("Counter");
    private JTextField  jtf1 = new JTextField(10);
    private JButton     jbt1 = new JButton("Count");
    
    public SwingCounter(){
        JFrame frame = new JFrame();
        frame.setTitle("Swing Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400,100);
        
        
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        p1.add(jlb1); 
        p1.add(jtf1); 
        p1.add(jbt1);
        frame.add(p1);
        
    }
    public static void main(String[] args) {
        SwingCounter s = new SwingCounter();
    }
}