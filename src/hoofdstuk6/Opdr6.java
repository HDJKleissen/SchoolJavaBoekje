package hoofdstuk6;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr6 extends Applet implements ActionListener 
{
	TextField pinField, bedragField;
	Button knop, resetKnop;
	double saldo = 1000;
	int pin = 1234;
	boolean wrongPin = false, wrongSald = false;
	
	public void init()
	{
		setLayout(null);
		pinField = new TextField();
		pinField.setBounds(50, 70, 90, 20);
		add(pinField);
		
		bedragField = new TextField();
		bedragField.setBounds(50, 120, 90, 20);
		add(bedragField);
		
		knop = new Button("Neem geld op");
		knop.setBounds(10, 145, 90, 20);
		add(knop);
		knop.addActionListener(this);
		
		resetKnop = new Button("Reset");
		resetKnop.setBounds(50, 180, 90, 20);
		add(resetKnop);
		resetKnop.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Input PIN", 65, 60);
		g.drawString("Input op te nemen bedrag", 30, 110);
		g.drawString("Saldo: " + saldo, 110, 160);
		if(wrongPin)
			g.drawString("Verkeerde PIN", 50, 30);
		if(wrongSald)
			g.drawString("Niet genoeg saldo", 50, 30);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		
		if(source == knop)
		{
			int inpPin = Integer.parseInt(pinField.getText());
			if(inpPin != 1234)
				wrongPin = true;
			else
			{
				double inpSald = Double.parseDouble(bedragField.getText());
				if(inpSald>saldo)
					wrongSald = true;
				else
				{
					saldo = saldo - inpSald;
					bedragField.setText("");
					wrongPin = false;
					wrongSald = false;
				}
			}
		}
		if(source == resetKnop)
		{
			NOG DOEN
		}
		repaint();
	}
}
