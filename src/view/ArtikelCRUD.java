package view;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArtikelCRUD
{
	public JPanel anzeigen()
	{
		JPanel main = new JPanel();
		main.setLayout(new GridLayout(5,2));
		
		JLabel lableName = new JLabel("Artikelname:");
		main.add(lableName);
		main.add(new JTextField("Name"));
		
		JLabel lablePreis = new JLabel("Preis:");
		main.add(lablePreis);
		main.add(new JTextField("Preis"));
		
		JLabel lableBeschreibung = new JLabel("Beschreibung:");
		main.add(lableBeschreibung);
		main.add(new JTextField("Beschreibung"));
		
		JLabel lableKategorie = new JLabel("Kategorie:");
		main.add(lableKategorie);
		String[] artikelKategorien = {"Buch", "TabletPC"};
		JComboBox<String> moeglicheKategorien = new JComboBox<String>(artikelKategorien);
		main.add(moeglicheKategorien);
		
		JPanel button = new JPanel();
		button.setLayout(new FlowLayout());
		button.add(new JButton("Ok"));
		main.add(button);
		
		return main;
	}
	public Map<String, Comparable> erstellen()
	{
		Map<String, Comparable> neuerArtikelMap = new HashMap<String, Comparable>();
		/*
		System.out.println("Name des Artikels, bitte:");
		neuerArtikelMap.put("name", eingabe.einlesenString());
		
		System.out.println("Preis des Artikels, bitte:");
		neuerArtikelMap.put("preis", eingabe.einlesenDouble());
		
		System.out.println("Beschreibung des Artikels, bitte:");
		neuerArtikelMap.put("beschreibung", eingabe.einlesenString());
		
		System.out.println("Kategorie des Artikels, bitte:");
		neuerArtikelMap.put("kategorie", eingabe.einlesenString());
		*/
		return neuerArtikelMap;
	}
}
