package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInAnsicht implements ActionListener
{	
	private RegistrationAnsicht registration = new RegistrationAnsicht();
	private JTextField emailField = new JTextField("Email hier", 12);
	private JTextField passwortField = new JPasswordField("", 12);
	private String[] loginData = new String[1];
	JPanel login = new JPanel();
	public JPanel anmelden()
	{
		
		login.setLayout(new FlowLayout());		
		
		emailField.setName("Email");
		emailField.addActionListener(this);
		
		passwortField.setName("Passwort");
		passwortField.addActionListener(this);
		
		JButton ok = new JButton("Ok");
		ok.addActionListener(this);
		
		JButton registrationsButton = new JButton("Registrieren");
		registrationsButton.addActionListener(this);
		
		login.add(new JLabel("Email: "));
		login.add(emailField);
		login.add(new JLabel("Passwort: "));
		login.add(passwortField);
		login.add(ok);
		login.add(new JLabel("Oder hier neu registrieren: "));
		login.add(registrationsButton);
		return login;
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Ok"))
		{
			System.out.println(emailField.getText()+" "+passwortField.getText());
			loginData[0]=emailField.getText();
			loginData[1]=passwortField.getText();
		}
		
		if(e.getActionCommand().equals("Registrieren"))
		{
			login = registration.userAnlegen();
		}
	}
}
