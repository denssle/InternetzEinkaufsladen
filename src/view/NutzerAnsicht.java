package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NutzerAnsicht
{
	public JPanel profilAusgeben()
	{
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		//main.setBackground(new Color(30, 30, 30));;
		String[] daten = {"Name", "Email", "Geburtstag", "Strasse", "Hausnummer", "Stadt", "Postleitzahl"};
		
		JPanel zeile = new JPanel();
		zeile.setLayout(new GridLayout(8,2));
		for(int i = 0; i < daten.length; i++)
		{
			zeile.add(new JLabel(daten[i]));
			zeile.add(new JLabel(daten[i]+" des Users"));
			
			
		}
		zeile.add(new JButton("Bearbeiten?"));
		main.add(zeile);
		
		return main;
	}
}
