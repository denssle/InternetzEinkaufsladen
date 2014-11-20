package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import logikabteilung.Artikel;
import logikabteilung.Artikelverwaltung;

public class EinkaufAnsicht implements ActionListener 
{	
	private Artikelverwaltung artikelLogik = new Artikelverwaltung();
	
	public JPanel startMenue()
	{
		Map<Integer, Artikel> artikelMap = artikelLogik.getAlleArtikel();
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		
		if(artikelMap.isEmpty())
		{
			main.add(new JLabel("Es sind keine Artikel vorhanden."));
		}
		else
		{
			main.add(artikelViewAusgeben(artikelMap));
		}
		return main;
	}
	private JPanel artikelViewAusgeben(Map<Integer, Artikel> artikelMap)
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
	        Artikel value = (Artikel) pairs.getValue();
	        zeile.add(new JLabel(key));
	        zeile.add(new JLabel(value.getName()));
	        JButton details = new JButton("Details");
	        details.setName(key);
	        details.addActionListener(this);;
	        
	        zeile.add(details);
		}
		return zeile; 
	}

	public void actionPerformed(ActionEvent e)
	{
		Map<Integer, Artikel> artikelMap = artikelLogik.getAlleArtikel();
		JButton presstButton = (JButton) e.getSource();
		String pressedButton = presstButton.getName();
		Iterator iterator = artikelMap.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry pairs = (Map.Entry)iterator.next();
	        String key = pairs.getKey().toString();
	        Artikel value = (Artikel) pairs.getValue();
	        if(pressedButton.equals(key))
	        {
	        	detailansicht(value);
	        }
		}
	}
	private void detailansicht(Artikel value)
	{
		JPanel detailView = new JPanel();
		detailView.setLayout(new GridLayout());
		detailView.add(new JLabel(value.getName()));
		detailView.add(new JLabel(value.getKategorie()));
		//detailView.add(new JLabel(value.getPreis()));
		detailView.add(new JLabel(value.getBeschreibung()));
		Controller.viewWechseln(detailView);
	}
	
}
