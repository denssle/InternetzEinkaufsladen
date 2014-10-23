package view;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArtikelCRUD
{
	public JPanel anzeigen()
	{
		JPanel main = new JPanel();
		main.setLayout(new GridLayout(5,1));
		
		main.add(new JTextField("Name"));
		main.add(new JTextField("Preis"));
		main.add(new JTextField("Beschreibung"));
		
		String[] artikelKategorien = {"Buch", "TabletPC"};
		JComboBox<String> moeglicheKategorien = new JComboBox<String>(artikelKategorien);
		main.add(moeglicheKategorien);
		
		main.add(new JButton("Ok"));
		
		
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
