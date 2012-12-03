package hoofdstuk2;

import java.applet.*;
import java.awt.*;

public class Opdr6 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillRect(30, 180-127, 40, 127);
		g.setColor(Color.RED);
		g.fillRect(80, 180-145, 40, 145);
		g.setColor(Color.GREEN);
		g.fillRect(130, 180-98, 40, 98);
		g.setColor(Color.BLACK);
		g.drawRect(10, 10, 180, 170);
		g.drawString("Charlotte", 24, 195);
		g.drawString("Welmer", 80, 195);
		g.drawString("Noa", 137, 195);
	}
}
