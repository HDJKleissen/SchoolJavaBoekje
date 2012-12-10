package hoofdstuk5;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr3 extends Applet implements ActionListener 
{
	float total = 0;
	Button resetButton;
	TextField inputField, sumField;
	public void init()
	{
		setLayout(null);
		inputField = new TextField();
		inputField.setBounds(20,90,70,20);
		add(inputField);
		inputField.addActionListener(this);
				
		sumField = new TextField();
		sumField.setBounds(110,90,70,20);
		add(sumField);
		
		resetButton = new Button("Reset total");
		resetButton.setBounds(60,130,70,20);
		add(resetButton);
		resetButton.addActionListener(this);
		
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Item Price:", 25, 85);
		g.drawString("Total:", 130, 85);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == inputField)	
		{
			float n1 = Float.parseFloat(inputField.getText());
			total = total + n1;
			sumField.setText("" + total);
			inputField.setText("");
		}
		if(source == resetButton)
		{
			sumField.setText("");
			total = 0;
		}
	}
}