package hoofdstuk9;

import java.applet.*;
import java.awt.*;
import ch.aplu.turtle.*;

public class Opdr2 extends Applet  
{
	Turtle turtle;
	
	public void init()
	{
		turtle = new Turtle();		
	}
	
	public void paint(Graphics g)
	{
		turtle.setPenColor(Color.BLACK);
		turtle.setPos(getWidth()-150.0, -getHeight()+40.0);
		tekenZesHoek(150.0);
	}
	public void tekenZesHoek(double zijde)
	{
		turtle.left(90.0);
		for(int i = 0; i < 6 ; i++)
		{
			
			turtle.forward(zijde);
			turtle.right(60.0);
		}
		turtle.right(90.0);
		turtle.setFillColor(Color.BLACK);
		turtle.fill(-10.0,-10.0);
		turtle.penUp();
	}
}
