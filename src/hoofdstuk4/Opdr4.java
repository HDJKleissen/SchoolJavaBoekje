package hoofdstuk4;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class Opdr4 extends Applet implements ActionListener 
{
	Button knop;
	TextField textField1;
	TextArea textArea1;
	int aantalSeconden = 3457;
	
	public void init()
	{
		setLayout(null);
		textField1 = new TextField("3457");
		textField1.setBounds(55, 40, 90, 20);
		add(textField1);
		knop = new Button("Uitrekenen");
		knop.setBounds(55, 70, 90, 20);
		knop.addActionListener(this);
		add(knop);
		textArea1 = new TextArea();
		textArea1.setBounds(25, 100, 150, 90);
		add(textArea1);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Input the amount of seconds", 25, 15);
		g.drawString(" to be converted", 55, 30);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int aantalSeconden, h, m, s;
		String secString = textField1.getText();
		aantalSeconden = Integer.parseInt(secString);
		h=aantalSeconden/3600;
		m=(aantalSeconden-(h*3600))/60;
		s=aantalSeconden-(h*3600)-(m*60);
		textArea1.setText(aantalSeconden+ " seconden is\n" + h + " uren\n" + m + " minuten\n" + s + " seconden");
	}
}
