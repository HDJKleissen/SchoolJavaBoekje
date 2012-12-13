package hoofdstuk7;

import java.awt.*;
import java.applet.*;

public class Opdr6 extends Applet
{
	boolean beenBlack = true;
	public void paint(Graphics g)
	{
		for(int i = 1 ; i <= 10 ; i++)
		{
			if(beenBlack)
			{
				g.drawRect(i*15, 15, 15, 15);
				beenBlack = false;
			}	
			else
			{
				g.fillRect(i*15, 15, 15, 16);
				beenBlack = true;
			}	
		}
	}
}
