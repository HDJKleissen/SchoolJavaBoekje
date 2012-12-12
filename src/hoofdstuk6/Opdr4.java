package hoofdstuk6;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdr4 extends Applet implements ActionListener 
{
	TextField numField1, numField2, numField3;
	Button knop;
	double n1, n2, n3;
	
	public void init()
	{
		setLayout(null);		
		
		numField1 = new TextField();
		numField1.setBounds(30,50,40,20);
		add(numField1);
		numField1.addActionListener(this);
		
		numField2 = new TextField();
		numField2.setBounds(80,50,40,20);
		add(numField2);
		numField2.addActionListener(this);
		
		numField3 = new TextField();
		numField3.setBounds(130,50,40,20);
		add(numField3);
		numField3.addActionListener(this);
		
		knop = new Button("Sort");
		knop.setBounds(60,80,80,20);
		add(knop);
		knop.addActionListener(this);
	}
		
	public void paint(Graphics g)
	{
		g.drawString("" + n1 + ", " + n2 + ", " + n3, 60, 120);
	}
	public void actionPerformed(ActionEvent e)
	{
		n1 = Double.parseDouble(numField1.getText());
		n2 = Double.parseDouble(numField2.getText());
		n3 = Double.parseDouble(numField3.getText());
		
		numField1.setText("");
		numField2.setText("");
		numField3.setText("");
		
		if(n1<n2)
		{
			double temp = n1;
			n1 = n2;
			n2 = temp;
		}
		if(n2<n3)
		{
			double temp = n2;
			n2 = n3;
			n3 = temp;
		}

		if(n1<n2)
		{
			double temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		repaint();
	}
}
