import java.awt.*;
import javax.swing.*;

public class Gif extends JFrame {

   

                          
     public void initComponents() {

        JFrame f1=new JFrame();
        JLabel jLabel1 = new JLabel();

        f1.setVisible(true);
        f1.setLocationRelativeTo(null);
        f1.setSize(1254, 764);
        f1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f1.setLayout(null);

        jLabel1.setIcon(new ImageIcon("C://Users//vamsi//Pictures//Background.gif")); 
        f1.add(jLabel1);
        jLabel1.setBounds(4, 4, 1250, 800);

        pack();
    }                       

 
    public static void main(String args[]) {
        Gif obj=new Gif();
        obj.initComponents();
       
    }

                     
}