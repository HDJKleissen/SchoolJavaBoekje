package hoofdstuk7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
import java.util.*;

public class Opdr5 extends Applet implements ActionListener
{
	Random rand = new Random();
	javax.swing.Timer timer;
	
	public void init()
	{
		timer = new javax.swing.Timer(100, this);
		timer.start();
	}
	public void paint(Graphics g)
	{
		for(int i = 0 ; i < 50; i++)
		{
			int j = 50-i;
			g.setColor(new Color(rand.nextInt(255/j)*j, rand.nextInt(255/j)*j, rand.nextInt(255/j)*j));
			g.fillOval(100-(j*2), 100-(j*2), j*4, j*4);
		}
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		repaint();		
	}
}
