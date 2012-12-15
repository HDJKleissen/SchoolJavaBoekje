package hoofdstuk8;

import java.awt.*;
import java.applet.*;

public class Opdr4 extends Applet
{
	public void paint(Graphics g)
	{
		tekenHuis(g,50,175,100,100,50);
	}
	
	public void tekenHuis(Graphics g, int x, int y, int basis, int huisHoogte, int dakHoogte)
	{
		g.drawRect(x,y-huisHoogte,basis,huisHoogte);
		tekenGelijkbenigeDriehoek(g,x,y-huisHoogte,basis,dakHoogte);
	}
	
	public void tekenGelijkbenigeDriehoek(Graphics g, int x, int y, int basis, int hoogte)
	{
		g.drawLine(x,y,x+basis,y);
		g.drawLine(x,y,x+(basis/2),y-hoogte);
		g.drawLine(x+basis,y,x+(basis/2),y-hoogte);
	}
}
