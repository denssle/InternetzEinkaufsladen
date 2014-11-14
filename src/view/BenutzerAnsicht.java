package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logikabteilung.Benutzer;
import logikabteilung.Benutzerverwaltung;

public class BenutzerAnsicht
{
	private Benutzerverwaltung nutzerLogik = new Benutzerverwaltung();

	public JPanel profilAusgeben()
	{
		Benutzer aktuell = nutzerLogik.getAktuellerBenuzer();
		if(aktuell != null)
		{
			return profilAngemeldeterAusgeben(aktuell);
		}
		return profilKeinAngemeldeterBenutzer();
	}

	private JPanel profilKeinAngemeldeterBenutzer()
	{
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		main.add(new JLabel("Kein Benutzer angemeldet. "));
		return main;
	}

	private JPanel profilAngemeldeterAusgeben(Benutzer aktuell)
	{
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
	
		String[] label = {"Name", "Email", "Geburtstag", "Strasse", "Hausnummer", "Stadt", "Postleitzahl"};
		String[] daten = {aktuell.getName(), aktuell.getEmail(), aktuell.getGeburtstag(), aktuell.getStrasse(), aktuell.getHausnummer(), aktuell.getStadt(), aktuell.getPlz()};

		JPanel zeile = new JPanel();
		zeile.setLayout(new GridLayout(8,2));
		for(int i = 0; i < daten.length; i++)
		{
			zeile.add(new JLabel(label[i]));
			zeile.add(new JLabel(daten[i]));
		}
		zeile.add(new JButton("Bearbeiten?"));
		main.add(zeile);
		
		return main;
	}
}
