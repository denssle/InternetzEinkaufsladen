package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logikabteilung.Artikelverwaltung;

public class EinkaufAnsicht
{	
	private Artikelverwaltung artikelLogik = new Artikelverwaltung();
	private Map<Integer, String> artikelMap = artikelLogik.getAlleArtikel();
	
	public JPanel startMenue()
	{
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		
		if(artikelMap.isEmpty())
		{
			main.add(new JLabel("Es sind keine Artikel vorhanden."));
		}
		else
		{
			main.add(artikelViewAusgeben());
		}
		return main;
	}
	private JPanel artikelViewAusgeben()
	{
		JPanel zeile = new JPanel();
		zeile.setLayout(new GridLayout(artikelMap.size()+1, 3));
		zeile.add(new JLabel("Artikelnummer: "));
		zeile.add(new JLabel("Artikel: "));
		zeile.add(new JLabel("Details: "));
		
		Iterator iterator = artikelMap.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry pairs = (Map.Entry)iterator.next();
	        String key = pairs.getKey().toString();
	        String value = pairs.getValue().toString();
	        zeile.add(new JLabel(key));
	        zeile.add(new JLabel(value));
	        zeile.add(new JButton("Details"));
		}
		return zeile; 
	}
}
