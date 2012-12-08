package hoofdstuk4;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr1 extends Applet implements ActionListener 
{
	Button knopGroter, knopKleiner;
	int diameter;
	
	public void init()
	{
		diameter = 10;
		knopGroter = new Button("Groter");
		knopGroter.addActionListener(this);
		add(knopGroter);
		
		knopKleiner = new Button("Kleiner");
		knopKleiner.addActionListener(this);
		add(knopKleiner);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(100, 100, diameter, diameter);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == knopGroter)
		{
			diameter++;
			repaint();
		}
		
		if(source == knopKleiner)
		{
			diameter--;
			repaint();
		}
			
	}
}
