package hoofdstuk9;

import java.applet.*;
import java.awt.*;
import ch.aplu.turtle.*;

public class Opdr1 extends Applet  
{
	Turtle turtle;
	
	public void init()
	{
		turtle = new Turtle();		
	}
	
	public void paint(Graphics g)
	{
		turtle.setPenColor(Color.BLACK);
		turtle.setPos(-getWidth()+40.0, -getHeight()+40.0);
		tekenTrap(5, 50.0);
		turtle.setPos(-getWidth()+40.0, -getHeight()+40.0);
		tekenTrap(9, 10.0);
		turtle.setPos(-getWidth()+40.0, -getHeight()+40.0);
		tekenTrap(3, 100.0);
		turtle.penUp();
	}
	
	public void tekenTrap(int treden, double tredeHoogte)
	{
		for(int i = 0; i < treden; i++)
		{
			turtle.forward(tredeHoogte);
			turtle.right(90.0);
			turtle.forward(40.0);
			turtle.left(90.0);
		}
	}
}
