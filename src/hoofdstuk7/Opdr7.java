package hoofdstuk7;

import java.awt.*;
import java.applet.*;

public class Opdr7 extends Applet
{
	boolean beenBlack1= true, beenBlack2 = false, firstLine = true;
	public void paint(Graphics g)
	{
		for(int y = 1 ; y <= 10 ; y++)
		{
			if(firstLine)
			{
				beenBlack1 = true;
				for(int x1 = 1 ; x1 <= 10 ; x1++)
				{
					if(beenBlack1)
					{
						g.drawRect(x1*15, y*15, 15, 15);
						beenBlack1 = false;
					}	
					else
					{
						g.fillRect(x1*15, y*15, 15, 16);
						beenBlack1 = true;
					}	
				}
				firstLine = false;
			}
			else
			{
				beenBlack2 = false;
				for(int x1 = 1 ; x1 <= 10 ; x1++)
				{
					if(beenBlack2)
					{
						g.drawRect(x1*15, y*15, 15, 15);
						beenBlack2 = false;
					}	
					else
					{
						g.fillRect(x1*15, y*15, 15, 16);
						beenBlack2 = true;
					}	
				}
				firstLine = true;
			}

		}	
	}
}
