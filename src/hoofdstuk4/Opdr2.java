package hoofdstuk4;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr2 extends Applet implements ActionListener 
{
	Button knopOmhoog, knopLinks, knopRechts, knopOmlaag;
	int x = 100, y = 100;
	
	public void init()
	{
		setLayout(null);
		knopOmhoog = new Button("^");
		knopOmhoog.setBounds(getWidth()/2 - 20, 140, 20, 20);
		knopOmhoog.addActionListener(this);
		add(knopOmhoog);
		
		knopLinks = new Button("<");
		knopLinks.setBounds(getWidth()/2 - 30, 160, 20, 20);
		knopLinks.addActionListener(this);
		add(knopLinks);
		
		knopRechts = new Button(">");
		knopRechts.setBounds(getWidth()/2 - 10, 160, 20, 20);
		knopRechts.addActionListener(this);
		add(knopRechts);
		
		knopOmlaag = new Button("v");
		knopOmlaag.setBounds(getWidth()/2 - 20, 180, 20,20);
		knopOmlaag.addActionListener(this);
		add(knopOmlaag);
		
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Hilko", x, y);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == knopOmhoog)
		{
			y-=10;
		}
		
		if(source == knopLinks)
		{
			x-=10;
		}
		if(source == knopOmlaag)
		{
			y+=10;
		}
		
		if(source == knopRechts)
		{
			x+=10;
		}
		repaint();
	}
}
