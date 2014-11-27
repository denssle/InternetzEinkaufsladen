package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import logikabteilung.Benutzerverwaltung;

public class LogInAnsicht implements ActionListener
{	
	private Benutzerverwaltung nutzerLogik = new Benutzerverwaltung();
	private RegistrationAnsicht registration = new RegistrationAnsicht();
	private JTextField emailField = new JTextField("Email hier", 12);
	private JTextField passwortField = new JPasswordField("", 12);	
	
	public JPanel anmelden()
	{
		if(Benutzerverwaltung.getAktuellerBenuzer() == null)
		{
			return nichtAngemeldet();
		}
		return angemeldet();
	}
	private JPanel angemeldet()
	{
		JPanel login = new JPanel();
		login.setLayout(new FlowLayout());	
		
		login.add(new JLabel("Sie sind angemeldet. "));
		return login;
	}
	private JPanel nichtAngemeldet()
	{
		JPanel login = new JPanel();
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
			String anmeldeStatus = nutzerLogik.anmelden(emailField.getText(),passwortField.getText());
			JOptionPane.showMessageDialog(null,anmeldeStatus);
			Benutzerverwaltung.getAktuellerBenuzer();
			Controller.viewWechseln(anmelden());
		}
		
		if(e.getActionCommand().equals("Registrieren"))
		{
			Controller.viewWechseln(registration.userAnlegen(nutzerLogik));
		}
	}
}
