package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logikabteilung.Artikelverwaltung;
import logikabteilung.Nutzerverwaltung;
import view.LogInAnsicht;


public class Controller implements ActionListener 
{
	private Nutzerverwaltung nutzerLogik = new Nutzerverwaltung();
	private Artikelverwaltung artikelLogik = new Artikelverwaltung();
		
	private LogInAnsicht login = new LogInAnsicht();
	private RegistrationAnsicht registration = new RegistrationAnsicht();
	private EinkaufAnsicht einkauf = new EinkaufAnsicht();
	private WarenkorbAnsicht warenkorb = new WarenkorbAnsicht();
	private NutzerAnsicht profil = new NutzerAnsicht();
	private ArtikelCRUD artikel = new ArtikelCRUD();
	
	private JFrame frame = new JFrame("InternetzLaden");
	private JPanel mainPanel = new JPanel();
	private JPanel ausgabe =  new JPanel();
	private JPanel statusleiste = menueLeisteErstellen();
	
	public void start()
	{
		frame.setSize(800,800);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)((d.width - frame.getSize().width) / 2);
		int y = (int)((d.height - frame.getSize().height) / 2);
		frame.setLocation(x, y);
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBackground(new Color(100,100,100));
		mainPanel.add("West", statusleiste);
		mainPanel.add("Center", ausgabe);
		
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	public JPanel menueLeisteErstellen()
	{
		String[] buttonlabels = {
				"Anmelden", 
				"Registrieren", 
				"Einkaufen", 
				"Profil", 
				"Verwaltung"};
		JPanel leiste = new JPanel();
		
		leiste.setLayout(new GridLayout(5,1));
		leiste.setPreferredSize(new Dimension(200, 600));
		
		for(int i = 0; i<buttonlabels.length; i++)
		{
			JButton neuerButton = new JButton(buttonlabels[i]);
			neuerButton.addActionListener(this);
			leiste.add(neuerButton);
		}
		
		return leiste;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		mainPanel.remove(1);
		String Befehl = e.getActionCommand();
		if (Befehl.equals("Anmelden"))
		{
			ausgabe = login.anmelden();
		}
		else if(Befehl.equals("Registrieren"))
		{
			ausgabe = registration.userAnlegen();
		}
		else if(Befehl.equals("Einkaufen"))
		{
			ausgabe = einkauf.start();
			//ausgabe = artikel.anzeigen();
		}
		else if(Befehl.equals("Profil"))
		{
			ausgabe = profil.profilAusgeben();
		}
		else if(Befehl.equals("Verwaltung"))
		{
			System.out.println("Verwaltung!");
		}
		mainPanel.add("Center", ausgabe);
		mainPanel.validate();
	}
}
	
