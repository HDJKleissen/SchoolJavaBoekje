package hoofdstuk5;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr5 extends Applet implements ActionListener 
{
	float total = 0, gem = 0;
	int grades = 0;
	Button resetButton, gemButton;
	TextField inputField, sumField;
	boolean drawInvInp = false;
	
	public void init()
	{
		setLayout(null);
		inputField = new TextField("");
		inputField.setBounds(20,90,75,20);
		add(inputField);
		inputField.addActionListener(this);
		
		sumField = new TextField();
		sumField.setBounds(110,90,70,20);
		add(sumField);
						
		resetButton = new Button("Reset total");
		resetButton.setBounds(15,140,70,20);
		add(resetButton);
		resetButton.addActionListener(this);
		
		gemButton = new Button("Calculate average");
		gemButton.setBounds(90,140,105,20);
		add(gemButton);
		gemButton.addActionListener(this);
		
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Input grades:", 20, 85);
		g.drawString("Total:", 120, 85);
		g.drawString("Average: " + gem, 60, 130);
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
			}				
			else
			{
			total = total + n1;
			grades++;
			sumField.setText("" + total);
			inputField.setText("");
			drawInvInp = false;
			}
		}
		if(source == resetButton)
		{
			total = 0;
			gem = 0;
			grades = 0;
			drawInvInp = false;
			inputField.setText("");
			sumField.setText("");
		}
		if(source == gemButton)
		{
			gem = total/grades;
			drawInvInp = false;
		}
		repaint();
	}
}