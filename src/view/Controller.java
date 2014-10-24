package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import logikabteilung.Artikelverwaltung;
import logikabteilung.Benutzer;
import logikabteilung.Nutzerverwaltung;


public class Controller
{
	private Nutzerverwaltung nutzerLogik = new Nutzerverwaltung();
	private Artikelverwaltung artikelLogik = new Artikelverwaltung();
	
	private Benutzer aktuellerNutzer;
	
	private HauptmenueAnsicht hauptmenue = new HauptmenueAnsicht();
	private LogInAnsicht login = new LogInAnsicht();
	private RegistrationAnsicht registration = new RegistrationAnsicht();
	private EinkaufAnsicht einkauf = new EinkaufAnsicht();
	private WarenkorbAnsicht warenkorb = new WarenkorbAnsicht();
	private NutzerAnsicht profil = new NutzerAnsicht();
	private ArtikelCRUD artikel = new ArtikelCRUD();
	
	private JFrame frame = new JFrame("InternetzLaden");
	
	JPanel mainPanel = new JPanel();
	
	public void start()
	{
		frame.setSize(800,800);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)((d.width - frame.getSize().width) / 2);
		int y = (int)((d.height - frame.getSize().height) / 2);
		frame.setLocation(x, y);
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		mainPanel.setLayout(new BorderLayout());
		

		JPanel leiste = hauptmenue.auswahlmenue();
		JPanel ausgabe;
		//ausgabe = login.anmelden();
		//ausgabe = artikel.anzeigen();
		//ausgabe = profil.profilAusgeben();
		ausgabe = registration.userAnlegen();
		
		mainPanel.add("West", leiste);
		mainPanel.add("Center", ausgabe);
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		frame.setVisible(true);
		//frame.revalidate();
	}
}
	
