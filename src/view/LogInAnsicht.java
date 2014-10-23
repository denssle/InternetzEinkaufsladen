package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class LogInAnsicht
{	
	public JPanel anmelden()
	{
		JPanel login = new JPanel();
		login.setLayout(new FlowLayout());
		login.setBackground(new Color(200,200,200));
		login.add(new TextField("Email"));
		login.add(new TextField("Passwort"));
		login.add(new JButton("Ok"));
		return login;
	}
}
