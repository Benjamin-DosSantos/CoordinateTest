import java.applet.Applet;
import java.awt.Graphics;

/**
 * 
 * @author Benjamin DosSantos
 * Project: Coordinates Test
 *
 */

public class CoordinateTest extends Applet{

	public void paint(Graphics g){
		
		g.drawOval(50, 100, 450, 300);
		
		g.drawLine(150, 150, 150, 250);
		
		g.drawLine(200, 150, 200, 250);
		
		g.drawLine(150, 250, 200, 250);
		
		g.drawLine(250, 150, 300, 150);
		
		g.drawLine(250, 150, 250, 250);
		
		g.drawLine(250, 200, 275, 200);
		
		g.drawOval(300, 150, 100, 100);
		
		g.drawRect(100, 250, 300, 100);		/** Arg3 Should Be 50  To Get Correct Look **/
		
		g.drawString("From Mars", 225, 275);
		
	}
	
}
