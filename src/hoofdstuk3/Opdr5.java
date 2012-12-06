package hoofdstuk3;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdr5 extends Applet implements ActionListener
{
	Button knop1, knop2, knop3;
	TextField textField;
	public void init()
	{
		setLayout(null);
		
		knop1 = new Button("Klik");
		knop1.setBounds(0, getHeight()/4, getWidth()/3, 20);
		knop1.addActionListener(this);
		add(knop1);
		
		knop2 = new Button("Klik");
		knop2.setBounds(getWidth()/3, getHeight()/4, getWidth()/3, 20);
		knop2.addActionListener(this);
		add(knop2);
		
		knop3 = new Button("Klik");
		knop3.setBounds(2*getWidth()/3, getHeight()/4, getWidth()/3, 20);
		knop3.addActionListener(this);
		add(knop3);
		
		textField = new TextField();
		textField.setBounds(getWidth()/6, getHeight()/2, getWidth()/3*2, 20);
		add(textField);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(new Color(200,15,183));
		g.fillRect(0, 0, getWidth()/3, getHeight());
		g.setColor(new Color(14,51,177));
		g.fillRect(getWidth()/3, 0, getWidth()/3, getHeight());
		g.setColor(new Color(111,156,171));
		g.fillRect(getWidth()/3*2, 0, getWidth()/3, getHeight());
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == knop1)
		{
			textField.setText("R: 200 | G: 15 | B:183");
		}
		if(source == knop2)
		{
			textField.setText("R: 14 | G: 51 | B: 177");
		}
		if(source == knop3)
		{
			textField.setText("R: 111 | G: 156 | B: 171");
		}
	}

}
