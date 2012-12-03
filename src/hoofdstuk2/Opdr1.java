package hoofdstuk2;

import java.applet.*;
import java.awt.*;

public class Opdr1 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(50, 200, 50, 50);
		g.setColor(Color.RED);
		g.fillRect(50, 50, 100, 30);
		g.setColor(Color.WHITE);
		g.fillRect(50, 80, 100, 30);
		g.setColor(Color.BLUE);
		g.fillRect(50, 110, 100, 30);
		g.setColor(Color.BLACK);
		g.drawRect(50,50,100,90);
		g.drawLine(50, 80, 150, 80);
		g.drawLine(50, 110, 150, 110);
	}
}
