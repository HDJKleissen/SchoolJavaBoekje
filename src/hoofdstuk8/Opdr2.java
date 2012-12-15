package hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr2 extends Applet
{
	public void paint(Graphics g)
	{
		tekenDriehoek(g,41,51,150,20,60,10);
		tekenDriehoek(g,82,15,183,111,127,176);
		tekenDriehoek(g,109,24,161,71,124,66);
	}
	
	public void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		g.drawLine(x1,y1, x2,y2);
		g.drawLine(x2,y2, x3,y3);
		g.drawLine(x3,y3, x1,y1);
	}

}
