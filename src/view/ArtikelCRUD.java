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
		String[] labels = {"Preis", "Beschreibung", "Kategorie"};
		main.setLayout(new GridLayout(labels.length+1,1));
		
		
		for(int i = 0; i<labels.length; i++)
		{
			JPanel zeile = new JPanel();
			zeile.setLayout(new FlowLayout());
			zeile.setBackground(new Color(220,220,220));
			
			zeile.add(new JLabel(), labels[i]);
			zeile.add(new TextField(labels[i]));
			main.add(zeile);
		}
		
		JPanel button = new JPanel();
		button.setLayout(new FlowLayout());
		button.add(new JButton("Ok"));
		main.add(button);
		
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
