package hoofdstuk6;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Opdr1 extends Applet implements ActionListener 
{
	TextField numField, outputField;
	Button knop;
	double highest, lowest;
	boolean firstNum = false;
	
	ArrayList<Double> numList = new ArrayList<Double>();
	
	public void init()
	{
		setLayout(null);		
		
		numField = new TextField();
		numField.setBounds(50,50,90,20);
		add(numField);
		numField.addActionListener(this);
		
		knop = new Button("Calculate highest");
		knop.setBounds(40,80,110,20);
		add(knop);
		knop.addActionListener(this);
	
		outputField = new TextField();
		outputField.setBounds(10,110,180,20);
		add(outputField);
	}
		
	public void actionPerformed(ActionEvent e)
	{
		Object source = e.getSource();
		if(source == numField)
		{
		numList.add(Double.parseDouble(numField.getText()));
		numField.setText("");
		}
		
		if(source == knop)
		{
			for(Double num : numList)
			{
				if(firstNum)
				{
					if(num < lowest)
					{
						lowest = num;
					}
					if(num > highest)
					{
						highest = num;	
					}
				}
				if(firstNum == false)
				{
					highest = num;
					lowest = num;
					firstNum = true;
				}
			}
			firstNum = false;
			outputField.setText("Lowest: " + lowest + " | Highest: " + highest);
			numList.clear();
		}
	}
}
