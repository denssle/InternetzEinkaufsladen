package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.util.HashMap;
import java.util.Map;
import java.awt.GridBagConstraints;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ArtikelCRUD
{
	public JPanel anzeigen()
	{
		
		JPanel main = new JPanel();
		main.add(new JTextField("Name"));
		main.add(new JTextField("Preis"));
		main.add(new JTextField("Beschreibung"));
		
		String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
		JComboBox petList = new JComboBox(petStrings);
		main.add(petList);
		
		main.add(new JButton("Ok"));
		
		
		return main;
	}
	public Map erstellen()
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
