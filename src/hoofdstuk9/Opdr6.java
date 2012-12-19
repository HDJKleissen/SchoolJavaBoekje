package hoofdstuk9;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import ch.aplu.turtle.*;

public class Opdr6 extends Applet implements ActionListener
{
	Turtle turtle;	
	
	TextField aantalVeld, zijdeVeld;
	Button knop;
	double invZijde = 0;
	int invAantal = 0;
	Playground playground = new Playground(null);
	public void init()
	{
		turtle = new Turtle();	
		setLayout(null);
		
		aantalVeld = new TextField();
		aantalVeld.setBounds(30,30,50,20);
		add(aantalVeld);
		
		zijdeVeld = new TextField(5);
		zijdeVeld.setBounds(120,30,50,20);
		add(zijdeVeld);
		
		knop = new Button("Teken figuur");
		knop.setBounds(55,60,90,20);
		add(knop);
		knop.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{		
		playground.clear();
		turtle.setPenColor(Color.BLACK);
		g.drawString("Aantal", 30,20);
		g.drawString("Zijde", 120,20);
		tekenFiguur(invAantal,invZijde);
	}
	
	public void tekenVeelhoek(int aantalHoeken, double zijde)
	{
		for(int i = 1; i <= aantalHoeken ; i++)
		{
			turtle.forward(zijde);
			turtle.right(360.0/aantalHoeken);
		}
	}
	
	public void tekenFiguur(int aantal, double zijde)
	{
		turtle.heading(0.0);
		playground.clear();
		for(int j = 1; j <= aantal; j++)
		{
			tekenVeelhoek(aantal,zijde);
			turtle.left(360.0/aantal);
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		playground.clear();
		invAantal = Integer.parseInt(aantalVeld.getText());
		invZijde= Double.parseDouble(zijdeVeld.getText());
		repaint();
	}
}
