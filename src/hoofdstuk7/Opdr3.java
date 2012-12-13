package hoofdstuk7;

import java.awt.*;
import java.applet.*;

public class Opdr3 extends Applet
{
	public void paint(Graphics g)
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			g.drawOval(100-(i*10), 100-(i*10), i*20, i*20);
		}
	}
}
