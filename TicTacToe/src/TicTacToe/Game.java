package TicTacToe;

import javax.swing.*;
import java.awt.event.*;
public class Game extends JFrame implements ActionListener{

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Game() {
        
        initComponents();
    }
                       
    private void initComponents() {
        
        JFrame f1=new JFrame(); 
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();
        JLabel l2 = new JLabel();

        f1.setVisible(true);
        f1.setSize(703, 520);
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.setLocationRelativeTo(null);
        f1.setTitle("Tic-Tac-Toe");

        

       
        
        b4.setIcon(new ImageIcon("F:\\Computer Project\\Images\\play_button.jpg")); 
        b4.setText("play");
        f1.add(b4);
        b4.addActionListener(this);
        b4.setBounds(540, 70, 160, 40);

        b2.setIcon(new ImageIcon("F:\\Computer Project\\Images\\instructionbutton3 (3).jpg")); 
         f1.add(b2);
        b2.setBounds(550, 330, 130, 50);
        b2.setText("instructions");
        b2.addActionListener(this);
       
        
        b3.setIcon(new ImageIcon("F:\\Computer Project\\Images\\about-buttont.png")); 
        f1.add(b3);
        b3.setBounds(550, 410, 130, 70);
        b3.setText("about");
        b3.addActionListener(this);

        l2.setIcon(new ImageIcon("C:\\Users\\vamsi\\Downloads\\Tic-Tac-Toe.png")); 
        
        f1.add(l2);
        l2.setBounds(35,-15,600,500);

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
            TicTacToe ob=new TicTacToe();
            ob.main(null);
        }
    }
    
    public static void main(String args[]) {
        
    	Game obj=new Game();
      
}
       
}

   


  
