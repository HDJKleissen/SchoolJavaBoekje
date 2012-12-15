package hoofdstuk8;

import java.awt.*;
import java.applet.*;

public class Opdr6 extends Applet
{
	public void paint(Graphics g)
	{
		tekenBoomGaard(g,5);
	}
	
	public void tekenBoom(Graphics g, double x, double y, double breedte, double hoogte)
	{
		double diameterB = breedte*3;
		double diameterH = hoogte*4/5;
		g.setColor(new Color(160,82,45));
		g.fillRect((int) x,(int)(y-hoogte),(int)breedte,(int)hoogte);
		g.setColor(Color.GREEN);
		g.fillOval((int)(x+(breedte/2))-(int)(diameterB/2),(int)(y-(hoogte+(diameterH/2))),(int)diameterB,(int)diameterH);
	}
	
	public void tekenBoomGaard(Graphics g,double bomen)
	{
		double x;
		double y = 190;
		double breedte = getWidth()/bomen/3;
		double hoogte = 130;
		
		for(double i = 0;i<bomen;i++)
		{
			tekenBoom(g, (i*breedte*3)+breedte, y, breedte, hoogte);
		}
		
	}
}
