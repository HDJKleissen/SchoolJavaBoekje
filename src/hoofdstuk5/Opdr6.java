package hoofdstuk5;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr6 extends Applet implements ActionListener
{
	
	int wPuntjes = 0, bPuntjes = 0;
	TextField invoerVeld1, invoerVeld2, uitvoerVeld;
	Button knop;
	
	public void init()
	{
		setLayout(null);
		invoerVeld1 = new TextField();
		invoerVeld1.setBounds(15,50,80,20);
		add(invoerVeld1);
		
		invoerVeld2 = new TextField();
		invoerVeld2.setBounds(100,50,80,20);
		add(invoerVeld2);
		
		knop = new Button("Calculate");
		knop.setBounds(50,80,90,20);
		add(knop);
		knop.addActionListener(this);
	
		uitvoerVeld = new TextField();
		uitvoerVeld.setBounds(50,110,90,20);
		add(uitvoerVeld);		
	}
	
	public void paint(Graphics g)
	{
		g.drawString("White breads", 20, 40);
		g.drawString("Brown breads", 100, 40);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
