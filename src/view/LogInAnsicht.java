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
	private JTextField emailField = new JTextField("Email hier", 12);
	private JTextField passwortField = new JPasswordField("", 12);
	private String[] loginData;
	
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
		
		login.add(new JLabel("Email: "));
		login.add(emailField);
		login.add(new JLabel("Passwort: "));
		login.add(passwortField);
		login.add(ok);
		return login;
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Ok"))
		{
			System.out.println(emailField.getText()+" "+passwortField.getText());
			//loginData[0]=emailField.getText();
			//loginData[1]=passwortField.getText();
		}
	}
}
