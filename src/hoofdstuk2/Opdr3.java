package hoofdstuk2;

import java.applet.*;
import java.awt.*;

public class Opdr3 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.CYAN);
		g.fillArc(50, 50, 100, 100, 0, 120);
		g.setColor(Color.ORANGE);
		g.fillArc(50, 50, 100, 100, 120, 120);
		g.setColor(Color.GREEN);
		g.fillArc(50, 50, 100, 100, 240, 120);
	}
}
