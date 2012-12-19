package hoofdstuk9;

import java.applet.*;
import java.awt.*;
import ch.aplu.turtle.*;

public class Opdr3 extends Applet  
{
	Turtle turtle;
	
	public void init()
	{
		turtle = new Turtle();		
	}
	
	public void paint(Graphics g)
	{
		turtle.setPenColor(Color.BLACK);
		turtle.setPos(-getWidth()+20, 0);
		for(int j = 0; j < 6 ; j++)
		{
			tekenVeelhoek(j+3,25.0);
			turtle.setPos(turtle.getX()+60.0,0.0);
		}
		turtle.penUp();
	}
	
	public void tekenVeelhoek(int hoeken, double zijde)
	{
		turtle.setHeading(0);
		for(int i = 0; i < hoeken; i++)
		{
			turtle.forward(zijde);
			turtle.right(360.0/hoeken);
		}
	}
}
