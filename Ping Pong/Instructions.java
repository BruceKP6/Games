
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Instructions extends JFrame  {
    public Instructions() {
        initComponents();
    }
    public void initComponents() {
        
        JLabel l1=new JLabel();
        JScrollPane jScrollPane1=new JScrollPane();
        JTextArea jTextArea1=new JTextArea(); 
        JFrame f1=new JFrame();

        f1.setVisible(true);
        f1.setSize(800,500);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f1.setBackground(new Color(153, 51, 0));
        f1.setLayout(null);
        
        l1.setIcon(new ImageIcon("D:\\imp\\Computer Project\\Images\\Instructions.png"));
        f1.add(l1);
        l1.setBounds(10, 20, 377, 420);
        
        jTextArea1.setEditable(false);
        jTextArea1.setBackground(Color.black);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Papyrus", 0, 18)); 
        jTextArea1.setRows(5);
        jTextArea1.setText("Player 1 : \nKeys :\n            Left (to move the racquet to the left)\n            Right (to move the racquet to the right)\n\nPlayer 2 :\nKeys :\n             A (to move the racquet to the left)\n             D (to move the racquet to the right)\n\nScoring System:\nPlayer 2 starts the serve with -1 points while \nPlayer 1 has 0.\nA point is awarded when the ball is hit and \nsubtracted when you miss the ball.\n");
        jTextArea1.setForeground(Color.white);
        f1.add(jTextArea1);
        jTextArea1.setBounds(400, 0, 370, 470);

        pack();
    }
   
    public static void main(String args[]) {
     Instructions obj=new Instructions();
    }
}
