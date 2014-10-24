package view;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistrationAnsicht
{
	Eingabe eingabe = new Eingabe();
	
	public Map<String, String> neuerNutzer()
	{
		Map<String, String> neuerNutzerMap = new HashMap<String, String>();
		String[] daten = {"name", "email", "geburtstag", "strasse", "hausnummer", "stadt", "plz", "password"};
		for(int i = 0; i < daten.length; i++)
		{
			System.out.println(daten[i]+"?");
			neuerNutzerMap.put(daten[i],eingabe.einlesenString());
		}
		return neuerNutzerMap;
	}

	public JPanel userAnlegen()
	{
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		
		String[] daten = {"Name", "Email", "Geburtstag", "Strasse", "Hausnummer", "Stadt", "Postleitzahl", "Password"};
		
		JPanel zeile = new JPanel();
		zeile.setLayout(new GridLayout(daten.length+1,2));
		for(int i = 0; i<daten.length; i++)
		{
			zeile.add(new JLabel(daten[i]));
			zeile.add(new JTextField("Hier bitte "+daten[i]+" eingeben."));
		}
		zeile.add(new JButton("Abschicken"));
		main.add(zeile);
		
		return main;
	}
}

