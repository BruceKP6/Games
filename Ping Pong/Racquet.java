
import java.awt.event.KeyEvent;
import java.awt.*;
import javax.swing .*;
public class Racquet {
	int x = 225;
	int xa = 0;
	private Game game;

	public Racquet(Game game) {
		this.game= game;
	}

	public void move() {
		if (x + xa > 0 && x + xa < game.getWidth()-60)
			x = x + xa;
	}

	public void paint(Graphics2D g) {
	    if(x<=200)
	    {
	    ImageIcon i=new ImageIcon("D:\\imp\\Computer Project\\Images\\ttracket.png");
	    Image image=i.getImage();
	    g.drawImage(image,x,350,null);
	   }
	   else
	   {
	       ImageIcon i=new ImageIcon("D:\\imp\\Computer Project\\Images\\ttracket2.png");
	    Image image=i.getImage();
	    g.drawImage(image,x,350,null);
	   }
	   
	}

	public void keyReleased(KeyEvent e) {
		xa = 0;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -1;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 1;
	}
	public Rectangle getBounds() {
		return new Rectangle(x, 350, 49, 60);
	}
	public int getTopY() {
		return 350;
	}
}
