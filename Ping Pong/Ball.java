import java.awt.*;
import javax.swing.*;
public class Ball {
    boolean var=true;
    String sc="",sc2="";
    static int score=-1,score2=0;
    int z=0,z2=0,z3=0;
	int x = 230;
	static int y = 200;
	int xa = 1;
	static int ya = 1;
	private Game game;
	public Ball(Game game) {
		this.game= game;
	}
	void move() {
	   
	   if (x + xa < 0)
			xa = 1;
	   if (x + xa > game.getWidth() - 30)
			xa = -1;
	   if (y + ya == 0)
			{
			  score2--;
			 
			  game.GameOver(); 
			 }
	   if(y + ya == 450-30)
	   {
	       score--;
	       
	       game.GameOver();
	   }
       if (collision()){
			ya = -1;
			y = game.racquet.getTopY() - 30;
			score++;
		    sc=Integer.toString(score);
		}
		if(collision2()){
		    ya=+1;
		    y=game.racquet2.getTopY()-30;
		    score2++;
		    sc2=Integer.toString(score2);
		  }
		x = x + xa;
		y = y + ya;
	}
    private boolean collision() {
		return game.racquet.getBounds().intersects(getBounds());
	}
	private boolean collision2() {
	    return game.racquet2.getBounds().intersects(getBounds());
	}
	public void paint(Graphics2D g) {
	if(z>255)
	    {
	        z=0;
	        z2+=8;
	     }
    if(z2>255)
    {
         z2=0;
         z3+=5;
      }
	if(z3>255)
	 z3=0;
	    
	    
	    String st=Name.jTextField2.getText();
	    String s=Name.jTextField1.getText();
		g.fillOval(x, y, 30, 30);
		  g.setColor(new Color(z,z2,z3));
		z+=2;
		g.setFont(new Font("Stencil", 0, 20));
	    g.drawString(s,300,20);
	    g.drawString(sc2,425,20);
	    g.drawString(st,300,250);
	    g.drawString(sc,425,250);
	   
	}
	public Rectangle getBounds() {
		return new Rectangle(x, y, 30, 30);
	}
}
