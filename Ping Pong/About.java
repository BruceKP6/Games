import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class About extends JFrame {

    public About() {
        initComponents();
    }                        
    public void initComponents() {
       
        JScrollPane jScrollPane1=new JScrollPane();
        JTextArea jTextArea1=new JTextArea(); 
        JFrame f1=new JFrame();

        f1.setVisible(true);
        f1.setSize(420,300);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f1.setLayout(null);

       

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new Color(255, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Papyrus", 0, 18)); 
        jTextArea1.setForeground(new Color(102, 255, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText("Ping Pong, now called  Table Tennis, is a sport in \nwhich two or four players hit a lightweight ball back \nand forth across a table using a small bat. \nThe game takes place on a hard table divided by a\n net. Except for the initial serve, the rules are\n generally as follows: \nplayers must allow a ball played toward them to\n bounce one time on their side of the table, and \nmust return it so that it bounces on the opposite \nside at least once. A point is scored when a \nplayer fails to return the ball within the rules. \nPlay is fast and demands quick reactions.\n \nOur version of Ping Pong is a simple multiplayer\ngame designed to simulate a Table Tennis match \non a 2D level.  The game being easy, makes it \nharder for you to win against your opponent. \n\nWell, Good Luck and Have Fun!");
        jScrollPane1.setViewportView(jTextArea1);

        f1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 400, 248);

        pack();
    }    
    
    public static void main(String args[]) {
     About obj=new About();
    }
}
