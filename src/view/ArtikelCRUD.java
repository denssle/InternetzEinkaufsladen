package view;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logikabteilung.Artikelverwaltung;

public class ArtikelCRUD implements ActionListener 
{
	private Artikelverwaltung artikelverwaltung = new Artikelverwaltung();
	private JComboBox<String> moeglicheKategorien;
	private String[] beschriftungen = {"Artikelname", "Preis", "Beschreibung"};
	private JTextField[] textFelder = new JTextField[beschriftungen.length];
	
	public JPanel anzeigen()
	{
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		
		JPanel zeile = new JPanel();
		zeile.setLayout(new GridLayout(beschriftungen.length+2,2));
		for(int i = 0; i<beschriftungen.length; i++)
		{
			zeile.add(new JLabel(beschriftungen[i]));
			JTextField zeilenText = new JTextField();
			zeilenText.setName(beschriftungen[i]);
			textFelder[i]=zeilenText;
			zeilenText.addActionListener(this);
			zeile.add(zeilenText);
		}
		
		zeile.add(new JLabel("Kategorie:"));
		String[] artikelKategorien = {"Buch", "TabletPC"};
		moeglicheKategorien = new JComboBox<String>(artikelKategorien);
		zeile.add(moeglicheKategorien);
		
		JButton button = new JButton("Ok");
		button.addActionListener(this);
		zeile.add(button);
		
		main.add(zeile);
		return main;
	}

	public void actionPerformed(ActionEvent e)
	{
		String eingabe = e.getActionCommand();
		Map neuerArtikelMap = new HashMap();
		
		if (eingabe.equals("Ok"))
		{
			for(int i = 0; i<beschriftungen.length; i++)
			{
				System.out.println(textFelder[i].getName() + " - "+textFelder[i].getText());
				neuerArtikelMap.put(textFelder[i].getName(), textFelder[i].getText());
			}
			String kategorieWahl = moeglicheKategorien.getItemAt((moeglicheKategorien.getSelectedIndex()));
			System.out.println(kategorieWahl);
			neuerArtikelMap.put("Kategorie",kategorieWahl);
			speichern(neuerArtikelMap);
		}
	}

	private void speichern(Map neuerArtikelMap)
	{
		try
		{
			artikelverwaltung.artikelSpeichern(neuerArtikelMap);
			
			Controller.viewWechseln(new JPanel());
		}
		catch(IllegalArgumentException error)
		{
			JOptionPane.showMessageDialog(null,error.getMessage());
		}
		catch(NullPointerException error)
		{
			JOptionPane.showMessageDialog(null,"Keine leeren Felder!");
		}
	}
}
