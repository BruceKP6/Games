import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Name extends JFrame  implements ActionListener
{
    JFrame f1=new JFrame();
    static JTextField jTextField1 = new JTextField("");
    static JTextField jTextField2 = new JTextField("");
    
                      
    private void initComponents() 
       {
        
        f1.setVisible(true);
        f1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f1.setSize(400, 300);
        f1.setLocationRelativeTo(null);
        f1.setLayout(null);

        JLabel jLabel1 = new JLabel("Enter the Player names");
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        f1.add(jLabel1);
        jLabel1.setBounds(109, 23, 179, 36);

        JLabel jLabel2 = new JLabel("Player 1 :");
        jLabel2.setFont(new java.awt.Font("Stencil", 0, 14));
        f1.add(jLabel2);
        jLabel2.setBounds(53, 90, 81, 27);

       
        f1.add(jTextField1);
        jTextField1.setBounds(140, 90, 186, 30);

        JLabel jLabel3 = new JLabel("Player 2 :");
        jLabel3.setFont(new java.awt.Font("Stencil", 0, 14));
        f1.add(jLabel3);
        jLabel3.setBounds(53, 135, 81, 23);

        
        f1.add(jTextField2);
        jTextField2.setBounds(140, 130, 190, 30);

        JButton jButton1 = new JButton();
        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Cooper Black", 0, 14)); 
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Continue");
        jButton1.addActionListener(this);
        f1.add(jButton1);
        jButton1.setBounds(133, 183, 110, 30);
        
        
        pack();
    }
    public void actionPerformed(ActionEvent ae)
    {
        
        Game ob=new Game();
        f1.dispose();
        ob.main(null);
        
    }
    public static void main(String args[]) {
         Name obj=new Name();
         obj.initComponents();
        
    }
                   
}
