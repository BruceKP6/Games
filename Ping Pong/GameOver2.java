
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GameOver2 extends JFrame implements ActionListener
{
    int s=0,s2=0;
    JFrame f1=new JFrame();
    public GameOver2()
    {
        f1.setVisible(true);
        f1.setSize(400,350);
        f1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);
        
        
          
        s=Ball.score;
        s2=Ball.score2;
        
       
        
        String st="";
        if(Ball.score > Ball.score2)
        {
            st=Name.jTextField2.getText()+"  is the WINNER!";
        }
        else 
        {
            st=Name.jTextField1.getText()+"  is the WINNER!";
        }
 
        
        JLabel l1=new JLabel(st);
        l1.setFont(new java.awt.Font("Stencil", 0, 20));
        f1.add(l1);
        l1.setBounds(0, 20, 400, 50);
        
        JLabel l2=new JLabel("SCORES");
        l2.setFont(new java.awt.Font("Stencil", 0, 20));
        f1.add(l2);
        l2.setBounds(150, 110, 80, 30);
        
        JLabel l3=new JLabel(Name.jTextField1.getText()+"         "+s2);
        l3.setFont(new java.awt.Font("Stencil", 0, 18));
        f1.add(l3);
        l3.setBounds(70, 164, 270, 30);
        
        JLabel l4=new JLabel(Name.jTextField2.getText()+"         "+s);
        l4.setFont(new java.awt.Font("Stencil", 0, 18));
        f1.add(l4);
        l4.setBounds(70, 220, 230, 30);
        
        JButton b1=new JButton("OK");
        b1.setBackground(new java.awt.Color(102, 255, 255));
        b1.setFont(new java.awt.Font("Cooper Black", 0, 14)); 
        b1.setForeground(new java.awt.Color(51, 51, 255));
        f1.add(b1);
        b1.setBounds(160, 260, 73, 23);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        f1.dispose();
    }

    public static void main(String args[])
       {
           GameOver2 obj=new GameOver2();
        
        }
 }
