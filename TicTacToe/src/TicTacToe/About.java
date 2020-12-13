package TicTacToe;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	public About() {
        initComponents();
    }                        
    public void initComponents() {
       
        JScrollPane jScrollPane1=new JScrollPane();
        JTextArea jTextArea1=new JTextArea(); 
        JFrame f1=new JFrame();

        f1.setVisible(true);
        f1.setSize(600,400);
        f1.setLocationRelativeTo(null);
        f1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f1.setLayout(null);

       

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(Color.black);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new Font("Papyrus", 0, 18)); 
        jTextArea1.setForeground(Color.ORANGE);
        jTextArea1.setRows(5);
        jTextArea1.setText(" The game of Tic-tac-toe is one of the most popular and commonly played\n games. This game does not allow one to win all the time and majority of the\n games played result in a draw. Thus, the best a player can hope is to not\n lose the game. Tic-tac-toe is a pencil-and-paper game for two players, X\n and O, who take turns marking the spaces in a 3 x 3 grid. The player X\n usually goes first. The player who succeeds in placing three respective\n marks in a horizontal, vertical or diagonal row wins the game. Our aim is to\n create a Tic-tac-toe game which allows the players to play n number of\n games and keep a record of the number of wins of each player.\n\nWell, Good Luck and Have Fun!");
        jScrollPane1.setViewportView(jTextArea1);

        f1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 600, 400);

        pack();
    }    
    
    public static void main(String args[]) {
     About obj=new About();
    }
}
