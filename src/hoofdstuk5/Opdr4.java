package hoofdstuk5;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr4 extends Applet implements ActionListener 
{
	float total = 0;
	Button resetButton;
	TextField inputField;
	public void init()
	{
		setLayout(null);
		inputField = new TextField("");
		inputField.setBounds(20,90,70,20);
		add(inputField);
		inputField.addActionListener(this);
						
		resetButton = new Button("Reset total");
		resetButton.setBounds(60,130,70,20);
		add(resetButton);
		resetButton.addActionListener(this);
		
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Item Price:", 25, 85);
		g.drawString("Total:", 110, 105);
		g.drawString("$" + total, 145, 105);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == inputField)	
		{
			float n1 = Float.parseFloat(inputField.getText());
			total = total + n1;
			inputField.setText("");
		}
		if(source == resetButton)
		{
			total = 0;
		}
		repaint();
	}
}