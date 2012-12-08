package eigenstoof;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class FindPrimes extends Applet implements ActionListener
{
	private int i;
	Button knop;
	TextField textField1, textField2;
	TextArea textArea1;

	public void init()
	{
		setLayout(null);
				
		textField1 = new TextField(10);
		textField1.setBounds(50, 60, 90, 20);
		add(textField1);
		
		knop = new Button("Check prime");
		knop.setBounds(50, 90, 90, 20);
		knop.addActionListener(this);
		add(knop);
				
		textArea1 = new TextArea();
		textArea1.setBounds(10, 120, 180, 80);
		add(textArea1);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Enter a number to see if", 30, 30);
		g.drawString("it is a prime number (above 1)", 20, 50);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		double num = Double.parseDouble(textField1.getText());
		boolean isPrime = checkPrime(num);
		int intNum = Integer.parseInt(textField1.getText());
		if(isPrime)
			textArea1.setText(intNum + " is a prime number!");
		else
			textArea1.setText(intNum + " is not a prime number.\n (dividable by " + i + ")");
	}
	
	public boolean checkPrime(double number)
	{
		double max = Math.floor(number/2)+1;
		if(number%2 == 0)
		{
			i = 2;
			return false;
		}
		for(i = 3 ; i <=  max ; i+=2)
		{
			if(number%i == 0)
				return false;
		}
		return true;
	}
}