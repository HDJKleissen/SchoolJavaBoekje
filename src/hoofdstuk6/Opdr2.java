package hoofdstuk6;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr2 extends Applet implements ActionListener 
{
	int voldoende = 0, onvoldoende = 0;
	TextField inputField;
	Button resetButton;
	boolean drawInvInp = false;
	
	public void init()
	{
		setLayout(null);
		inputField = new TextField("");
		inputField.setBounds(20,90,75,20);
		add(inputField);
		inputField.addActionListener(this);	
		
		resetButton = new Button("Reset");
		resetButton.setBounds(20, 120, 75, 20);
		add(resetButton);
		resetButton.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Input grades:", 20, 85);
		g.drawString("Voldoendes: " + voldoende, 100, 95);
		g.drawString("Onvoldoendes: " + onvoldoende, 100, 115);
		if(drawInvInp)
			g.drawString("Invalid input", 60, 60);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == inputField)	
		{
			float n1 = Float.parseFloat(inputField.getText());
			if(n1>10)
			{
				drawInvInp = true;
				inputField.setText("");
			}				
			else
			{
				if(n1<5.5)
				{
					onvoldoende++;
				}
				else
				{
					voldoende++;
				}
				inputField.setText("");
				drawInvInp = false;
			}
		}
		if(source == resetButton)
		{
			onvoldoende = 0;
			voldoende = 0;
			drawInvInp = false;
			inputField.setText("");
		}
		repaint();
	}
}