package hoofdstuk5;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr2 extends Applet implements ActionListener 
{
	Button knop;
	TextField textField1, textField2, resultField;
	public void init()
	{
		setLayout(null);
		textField1 = new TextField();
		textField1.setBounds(10,90,60,20);
		add(textField1);
		
		knop = new Button("BTW:");
		knop.setBounds(80, 90, 40, 20);
		add(knop);
		knop.addActionListener(this);
		
		resultField = new TextField();
		resultField.setBounds(130,90,60,20);
		add(resultField);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Input price without taxes to", 25, 40);
		g.drawString("calculate price with taxes", 30, 55);
	}
	public void actionPerformed(ActionEvent e)
	{
		double n1 = Double.parseDouble(textField1.getText());
		
		double btw = n1*1.21;
		resultField.setText("" + btw);
	}
}
