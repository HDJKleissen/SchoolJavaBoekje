package hoofdstuk7;

import java.awt.*;
import java.applet.*;

public class Opdr2 extends Applet
{
	public void paint(Graphics g)
	{
		for(int i = 1 ; i <= 5 ; i++)
		{
			g.drawOval(50, 50, i*20, i*20);
		}
	}
}
