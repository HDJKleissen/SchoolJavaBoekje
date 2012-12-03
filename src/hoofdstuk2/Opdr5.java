package hoofdstuk2;

import java.applet.*;
import java.awt.*;

public class Opdr5 extends Applet 
{
	public void paint(Graphics g)
	{
		for(int i = 1 ; i<=4 ; i++)
			g.drawLine(40*i, 40, 40*i, 160);
		for(int i = 1 ; i<=4 ; i++)
			g.drawLine(40, 40*i, 160, 40*i);
	}
}
