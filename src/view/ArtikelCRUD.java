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
		main.setLayout(new FlowLayout());
		
		JPanel zeileN = new JPanel();
		zeileN.setLayout(new GridLayout(1,2));
		zeileN.add(new JLabel("Artikelname:"));
		zeileN.add(new JTextField("Name"));
		
		JPanel zeileP = new JPanel();
		zeileP.setLayout(new GridLayout(1,2));
		zeileP.add(new JLabel("Preis des Artikels:"));
		zeileP.add(new JTextField("Preis"));
		
		JPanel zeileB = new JPanel();
		zeileB.setLayout(new GridLayout(1,2));
		zeileB.add(new JLabel("Beschreibung:"));
		zeileB.add(new JTextField("Beschreibung"));
		
		JPanel zeileK = new JPanel();
		zeileK.setLayout(new GridLayout(1,2));
		zeileK.add(new JLabel("Kategorie:"));
		String[] artikelKategorien = {"Buch", "TabletPC"};
		JComboBox<String> moeglicheKategorien = new JComboBox<String>(artikelKategorien);
		zeileK.add(moeglicheKategorien);
		
		JPanel button = new JPanel();
		button.setLayout(new FlowLayout());
		button.add(new JButton("Ok"));
		
		main.add(zeileN);
		main.add(zeileP);
		main.add(zeileB);
		main.add(zeileK);
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
