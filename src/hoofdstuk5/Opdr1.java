package hoofdstuk5;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr1 extends Applet implements ActionListener 
{
	Button knop;
	TextField textField1, textField2, resultField;
	public void init()
	{
		setLayout(null);
		textField1 = new TextField();
		textField1.setBounds(10,90,40,20);
		add(textField1);

		textField2 = new TextField();
		textField2.setBounds(70,90,40,20);
		add(textField2);
		
		knop = new Button("=");
		knop.setBounds(120, 90, 20, 20);
		add(knop);
		knop.addActionListener(this);
		
		resultField = new TextField();
		resultField.setBounds(150,90,40,20);
		add(resultField);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("X", 55, 105);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int n1 = Integer.parseInt(textField1.getText());
		int n2 = Integer.parseInt(textField2.getText());
		
		int prod = n1*n2;
		resultField.setText("" + prod);
	}
}
