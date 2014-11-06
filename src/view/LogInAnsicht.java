package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LogInAnsicht
{	
	public JPanel anmelden()
	{
		JPanel login = new JPanel();
		login.setLayout(new FlowLayout());
		login.add(new TextField("Email"));
		login.add(new TextField("Passwort"));
		login.add(new JButton("Ok"));
		return login;
	}
}
