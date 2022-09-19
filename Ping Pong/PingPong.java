import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.*;
public class PingPong extends JFrame implements ActionListener{

    
    public PingPong() {
        
        initComponents();
    }
                       
    private void initComponents() {
        
        JFrame f1=new JFrame(); 
        JLabel l1 = new JLabel();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        JLabel l2 = new JLabel();

        f1.setVisible(true);
        f1.setSize(703, 520);
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.setLocationRelativeTo(null);
        f1.setTitle("Ping Pong");

        

       
        
        b4.setIcon(new ImageIcon("D:\\imp\\Computer Project\\Images\\play_button.jpg")); 
        b4.setText("play");
        f1.add(b4);
        b4.addActionListener(this);
        b4.setBounds(540, 70, 160, 40);

        b2.setIcon(new ImageIcon("D:\\imp\\Computer Project\\Images\\instructionbutton3 (3).jpg")); // NOI18N
         f1.add(b2);
        b2.setBounds(550, 330, 130, 50);
        b2.setText("instructions");
        b2.addActionListener(this);
       
        
        b3.setIcon(new ImageIcon("D:\\imp\\Computer Project\\Images\\about-buttont.png")); 
        f1.add(b3);
        b3.setBounds(360, 410, 130, 70);
        b3.setText("about");
        b3.addActionListener(this);

        l2.setIcon(new ImageIcon("D:\\imp\\Computer Project\\Images\\ping-pong.png")); 
        
        f1.add(l2);
        l2.setBounds(0, 0,685,498);

        pack();
    }                   
     public void actionPerformed(ActionEvent a)
    {
        String button=a.getActionCommand();
        if(button.equals("about"))
        {
        About obj=new About();
       
         }
        else if(button.equals("instructions"))
        {
            Instructions obj=new Instructions();
        }
        else
        {
            Name ob=new Name();
            ob.main(null);
        }
    }
    
    public static void main(String args[]) {
        
      PingPong obj=new PingPong();
      
}
       
 }

   


  