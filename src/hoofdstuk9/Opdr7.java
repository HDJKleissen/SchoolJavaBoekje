package hoofdstuk9;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import ch.aplu.turtle.*;

public class Opdr7 extends Applet implements ActionListener
{
	Turtle turtle;	
	
	TextField aantalVeld, hoekVeld, stapVeld;
	Button knop; 
	int invAantal = 0, invHoek = 0, invStap = 0;
	Playground playground = new Playground(null);
	
	public void init()
	{
		turtle = new Turtle();	
		setLayout(null);
		
		aantalVeld = new TextField();
		aantalVeld.setBounds(10,30,50,20);
		add(aantalVeld);
		
		hoekVeld = new TextField();
		hoekVeld.setBounds(70,30,50,20);
		add(hoekVeld);
		
		stapVeld = new TextField();
		stapVeld.setBounds(130,30,50,20);
		add(stapVeld);
		
		knop = new Button("Teken figuur");
		knop.setBounds(55,60,90,20);
		add(knop);
		knop.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{		
		playground.clear();
		turtle.setPenColor(Color.BLACK);
		g.drawString("Aantal", 10,20);
		g.drawString("Hoek", 70,20);
		g.drawString("Stap", 130,20);
		for(int i = 0 ; i < invAantal ; i++)
		{
			tekenBoog(invHoek,invStap);
			turtle.right(90);
		}
	}
	
	public void tekenBoog(int hoek, int stap)
	{
		for(int i = 1; i <= hoek ; i++)
		{
			turtle.forward(stap/10.0);
			turtle.rt(1);
		}
	}


	public void actionPerformed(ActionEvent e)
	{
		playground.clear();
		invAantal = Integer.parseInt(aantalVeld.getText());
		invHoek= Integer.parseInt(hoekVeld.getText());
		invStap = Integer.parseInt(stapVeld.getText());
		repaint();
	}
}
