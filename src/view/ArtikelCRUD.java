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
		main.setLayout(new GridLayout(5,1));
		
		JPanel zeileN = new JPanel();
		zeileN.setLayout(new FlowLayout());
		JLabel lableName = new JLabel("Artikelname:");
		zeileN.add(lableName);
		zeileN.add(new JTextField("Name"));
		
		JPanel zeileP = new JPanel();
		zeileP.setLayout(new FlowLayout());
		JLabel lablePreis = new JLabel("Preis des Artikels:");
		zeileP.add(lablePreis);
		zeileP.add(new JTextField("Preis"));
		
		JPanel zeileB = new JPanel();
		zeileB.setLayout(new FlowLayout());
		JLabel lableBeschreibung = new JLabel("Beschreibung:");
		zeileB.add(lableBeschreibung);
		zeileB.add(new JTextField("Beschreibung"));
		
		JPanel zeileK = new JPanel();
		zeileK.setLayout(new FlowLayout());
		JLabel lableKategorie = new JLabel("Kategorie:");
		zeileK.add(lableKategorie);
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
