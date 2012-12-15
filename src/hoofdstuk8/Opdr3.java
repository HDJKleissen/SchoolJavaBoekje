package hoofdstuk8;

import java.awt.*;
import java.applet.*;

public class Opdr3 extends Applet
{
	public void paint(Graphics g)
	{
		tekenGelijkbenigeDriehoek(g,50,50,40,40);
		tekenGelijkbenigeDriehoek(g,90,100,20,90);
		tekenGelijkbenigeDriehoek(g,40,150,90,30);
	}
	
	public void tekenGelijkbenigeDriehoek(Graphics g, int x, int y, int basis, int hoogte)
	{
		g.drawLine(x,y,x+basis,y);
		g.drawLine(x,y,x+(basis/2),y-hoogte);
		g.drawLine(x+basis,y,x+(basis/2),y-hoogte);
	}
}
