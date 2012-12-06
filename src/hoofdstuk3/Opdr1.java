package hoofdstuk3;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdr1 extends Applet implements ActionListener
{
	Button knop;
	TextField textField1, textField2, textField3;
	
	
	public void init()
	{
		setLayout(null);
		knop = new Button("Klik hier");
		knop.setBounds(50, 40, 90, 20);
		knop.addActionListener(this);
		add(knop);
		
		textField1 = new TextField(10);
		textField1.setBounds(50, 70, 90, 20);
		add(textField1);
		
		textField2 = new TextField(10);
		textField2.setBounds(50, 100, 90, 20);
		add(textField2);
		
		textField3 = new TextField(10);
		textField3.setBounds(50, 130, 90, 20);
		add(textField3);
	}

	public void actionPerformed(ActionEvent e)
	{
		textField1.setText("Hilko Kleissen");
		textField2.setText("0648277854");
		textField3.setText("Schaatsen");
	}
}
