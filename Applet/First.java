import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
public class First extends Applet
{
public void paint(Graphics g)
	{
		g.drawString("It's time to Coding",150,150);
		g.drawLine(20,20,200,20);
		g.drawOval(170,100,30,30);
		g.setColor(Color.pink);
		g.fillOval(170,100,30,30);
		g.drawRect(170,200,30,30);
		g.setColor(Color.blue);
		g.fillRect(170,200,30,30);
	}
}