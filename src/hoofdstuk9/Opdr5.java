package hoofdstuk9;

import java.applet.*;
import java.awt.*;
import ch.aplu.turtle.*;

public class Opdr5 extends Applet  
{
	Turtle turtle;
	
	public void init()
	{
		turtle = new Turtle();		
	}
	
	public void paint(Graphics g)
	{
		turtle.setPenColor(Color.BLACK);
		for(int i = 0; i<6 ; i++)
		{
			turtle.heading(i*60.0);
			tekenRuit(50.0);
		}
	}
	public void tekenRuit(double zijde)
	{
		for(int j = 0; j < 2 ; j++)
		{
			turtle.forward(zijde);
			turtle.right(60.0);
			turtle.forward(zijde);
			turtle.right(120.0);
		}
	}
}
