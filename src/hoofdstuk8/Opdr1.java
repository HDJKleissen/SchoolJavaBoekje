package hoofdstuk8;

import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr1 extends Applet implements ActionListener
{
	Random random = new Random();
	Button knop;
	TextField textField;
	public void init()
	{
		setLayout(null);
		knop = new Button("Click for random number");
		knop.setBounds(20,50,150,20);
		add(knop);
		knop.addActionListener(this);
		
		textField = new TextField();
		textField.setBounds(50,80,90,20);
		add(textField);
	}
	public int trekking()
	{
		return random.nextInt(899)+100;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int num = trekking();
		textField.setText("" + num);
	}
}
