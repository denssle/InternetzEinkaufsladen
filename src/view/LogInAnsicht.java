package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class LogInAnsicht
{	
	public JPanel anmelden()
	{
		JPanel login = new JPanel();
		login.setLayout(new BorderLayout());
		login.setBackground(new Color(200,200,200));
		login.add(new JScrollBar(), BorderLayout.EAST);
		login.add(new TextField("Email"), BorderLayout.WEST);
		login.add(new TextField("Passwort"), BorderLayout.WEST);
		return login;
	}
}
