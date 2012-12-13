package hoofdstuk7;

import java.awt.*;
import java.applet.*;
import java.util.*;

public class Opdr4 extends Applet
{
	Random rand = new Random();
	public void paint(Graphics g)
	{
		for(int i = 1 ; i<=5 ; i++)
		{
			g.setColor(new Color(rand.nextInt(255/i)*i, rand.nextInt(255/i)*i, rand.nextInt(255/i)*i));
			g.drawOval(50, 50, i*20, i*20);
		}
	}
}
