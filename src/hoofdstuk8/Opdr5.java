package hoofdstuk8;

import java.awt.*;
import java.applet.*;

public class Opdr5 extends Applet
{
	public void paint(Graphics g)
	{
		tekenBoom(g,80,190,40,130);
	}
	
	public void tekenBoom(Graphics g,int x,int y,int breedte,int hoogte)
	{
		int diameterB = breedte*3;
		int diameterH = hoogte*4/5;
		g.setColor(new Color(160,82,45));
		g.fillRect(x,y-hoogte,breedte, hoogte);
		g.setColor(Color.GREEN);
		g.fillOval(x+(breedte/2)-(diameterB/2),y-(hoogte+(diameterH/2)),diameterB,diameterH);
	}
}
