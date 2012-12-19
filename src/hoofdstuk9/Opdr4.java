package hoofdstuk9;

import java.applet.*;
import java.awt.*;
import ch.aplu.turtle.*;

public class Opdr4 extends Applet  
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
			tekenDrieHoek(50.0);
		}
	}
	public void tekenDrieHoek(double zijde)
	{
		for(int j = 0; j < 3 ; j++)
		{
			turtle.forward(zijde);
			turtle.right(120.0);
		}
	}
}
