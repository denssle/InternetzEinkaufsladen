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
	private Map<String, String> neuerArtikelMap = new HashMap<String, String>();
	
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

		if (eingabe.equals("Ok"))
		{
			for(int i = 0; i<beschriftungen.length; i++)
			{
				JTextField feldInhalt= textFelder[i];
				System.out.println(feldInhalt.getText());
				neuerArtikelMap.put(feldInhalt.getName(), feldInhalt.getText());
			}
			String kategorieWahl = moeglicheKategorien.getItemAt((moeglicheKategorien.getSelectedIndex()));
			System.out.println(kategorieWahl);
			neuerArtikelMap.put("Kategorie",kategorieWahl );
			speichern();
		}
	}

	private void speichern()
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
		
	}
}
