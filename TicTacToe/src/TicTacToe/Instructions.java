package TicTacToe;


import javax.swing.*;
import java.awt.*;

public class Instructions extends JFrame  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Instructions() {
        initComponents();
    }
    public void initComponents() {
        
        JLabel l1=new JLabel();
        JTextArea jTextArea1=new JTextArea(); 
        JFrame f1=new JFrame();

        f1.setVisible(true);
        f1.setSize(800,500);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f1.setBackground(new Color(153, 51, 0));
        f1.setLayout(null);
        
        l1.setIcon(new ImageIcon("C:\\Users\\vamsi\\Downloads\\TicTacToeGrid.png"));
        f1.add(l1);
        l1.setBounds(10, 20, 377, 420);
        
        jTextArea1.setEditable(false);
        jTextArea1.setBackground(Color.black);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Papyrus", 0, 18)); 
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\n Tic-tac-toe is a two-player game.\n\n In this game, there is a board with 3x3 squares.\n\n The player X usually goes first.\n\n The player who succeeds in placing three\n respective marks in a horizontal, vertical or\n diagonal row wins the game.\n\n The game score is also displayed on the side.");
        jTextArea1.setForeground(Color.white);
        f1.add(jTextArea1);
        jTextArea1.setBounds(400, 0, 370, 470);

        pack();
    }
   
    public static void main(String args[]) {
     Instructions obj=new Instructions();
    }
}