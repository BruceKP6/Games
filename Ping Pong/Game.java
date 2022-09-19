import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Game extends JPanel implements ActionListener{
    static Game game = new Game();
	static JFrame frame = new JFrame("Ping Pong");
    Ball ball = new Ball(this);
	Racquet racquet = new Racquet(this);
	Racquet2 racquet2 = new Racquet2(this);
	Timer t=new Timer(8,this);
   
	public Game() {
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			    racquet2.keyReleased(e);
				racquet.keyReleased(e);
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
			    racquet2.keyPressed(e);
				racquet.keyPressed(e);
				
			}
		});
		setFocusable(true);
		
		t.start();
	}
	
	private void move() {
	    
		ball.move();
		racquet.move();
		racquet2.move();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.drawLine(0,230,460,230);
		ball.paint(g2d);
		racquet.paint(g2d);
		racquet2.paint(g2d);
	}

	public static void main(String[] args) {
	    
	    
		frame.setResizable(false);
		frame.add(game);
		frame.setSize(460, 450);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
	   
	    move();
	    repaint();
	   
    }
   
    public void GameOver()
    {
        t.stop();
        frame.dispose();
        GameOver2 obj=new GameOver2();
    }
}
