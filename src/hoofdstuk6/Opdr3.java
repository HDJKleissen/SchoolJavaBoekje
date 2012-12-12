package hoofdstuk6;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr3 extends Applet implements ActionListener 
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
		if(drawInvInp)
			g.drawString("Invalid input", 25, 155);
		g.setColor(Color.GREEN);
		g.drawString("Voldoendes", 10, 55);
		g.fillRect(100,200-voldoende, 40, voldoende);
		g.setColor(Color.RED);
		g.drawString("Onvoldoendes", 5, 70);
		g.fillRect(150,200-onvoldoende, 40, onvoldoende);
		g.setColor(Color.BLACK);
		g.drawString("" + voldoende, 115, 200-(voldoende/2));
		g.drawString("" + onvoldoende, 165, 200-(onvoldoende/2));
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