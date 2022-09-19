import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Racquet2 {
	int x = 225;
	int xa = 0;
	private Game game;
	public Racquet2(Game game) {
		this.game= game;
	}
	public void move() {
		if (x + xa > 0 && x + xa < game.getWidth()-60)
			x = x + xa;
	}
	public void paint(Graphics2D g) {
	    if(x>=230)
	    {
	    ImageIcon i=new ImageIcon("D:\\imp\\Computer Project\\Images\\ttracket2.png");
	    Image image=i.getImage();
	    g.drawImage(image,x,10,null);
	   }
	   else
	   {
	       ImageIcon i=new ImageIcon("D:\\imp\\Computer Project\\Images\\ttracket.png");
	    Image image=i.getImage();
	    g.drawImage(image,x,10,null);
	   }
	}
	public void keyReleased(KeyEvent e) {
		xa = 0;
	}
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_A)
			xa = -1;
		if (e.getKeyCode() == KeyEvent.VK_D)
			xa = 1;
	}
	public Rectangle getBounds()
	{
	    return new Rectangle(x,10,49,60);
	}
	 public int getTopY()
	 {
	     return 100;
	 }
}
