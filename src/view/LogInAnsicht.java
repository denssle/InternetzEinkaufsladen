package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogInAnsicht implements ActionListener
{	
	private JTextField emailField = new JTextField("Email", 12);
	private JTextField passwortField = new JTextField("Passwort", 12);
	
	public JPanel anmelden()
	{
		
		JPanel login = new JPanel();
		login.setLayout(new FlowLayout());		
		
		emailField.setName("Email");
		emailField.addActionListener(this);
		
		passwortField.setName("Passwort");
		passwortField.addActionListener(this);
		
		JButton ok = new JButton("Ok");
		ok.addActionListener(this);
		
		login.add(emailField);
		login.add(passwortField);
		login.add(ok);
		return login;
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Ok"))
		{
			System.out.println(emailField.getText()+" "+passwortField.getText());
		}
	}
}
