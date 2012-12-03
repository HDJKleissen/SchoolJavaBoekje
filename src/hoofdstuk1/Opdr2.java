package hoofdstuk1;

import java.applet.*;
import java.awt.*;

public class Opdr2 extends Applet 
{
	public void init()
	{
		setBackground(Color.YELLOW);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Hallo", 50, 20);
		g.drawLine(50, 30, 150, 30);
		g.setColor(Color.RED);
		g.fillRect(50, 80, 100, 80);
	}
}
