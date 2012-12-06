package hoofdstuk3;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdr3 extends Applet implements ActionListener
{
	Button knop, knop2, resetKnop;
	TextField textField1, textField2, textField3;
	
	
	public void init()
	{
		setLayout(null);
		knop = new Button("Klik hier");
		knop.setBounds(50, 10, 90, 20);
		knop.addActionListener(this);
		add(knop);
		
		knop2 = new Button("Klik hier 2");
		knop2.setBounds(50, 40, 90, 20);
		knop2.addActionListener(this);
		add(knop2);
		
		textField1 = new TextField(10);
		textField1.setBounds(50, 70, 90, 20);
		add(textField1);
		
		textField2 = new TextField(10);
		textField2.setBounds(50, 100, 90, 20);
		add(textField2);
		
		textField3 = new TextField(10);
		textField3.setBounds(50, 130, 90, 20);
		add(textField3);
		
		resetKnop = new Button("Reset");
		resetKnop.setBounds(50, 160, 90, 20);
		resetKnop.addActionListener(this);
		add(resetKnop);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == knop)
		{
		textField1.setText("Hilko Kleissen");
		textField2.setText("0648277854");
		textField3.setText("Schaatsen");
		}
		if(source == knop2)
		{
			textField1.setText("Kaas");
			textField2.setText("1234567890");
			textField3.setText("Eten");			
		}
		if(source == resetKnop)
		{
			textField1.setText("");
			textField2.setText("");
			textField3.setText("");			
		}
	}
}
