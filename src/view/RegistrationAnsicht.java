package view;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logikabteilung.Benutzerverwaltung;

public class RegistrationAnsicht implements ActionListener
{	
	private Benutzerverwaltung nutzerLogik = new Benutzerverwaltung();
	private String[] daten = {"Name", "Email", "Geburtstag", "Strasse", "Hausnummer", "Stadt", "Postleitzahl", "Password"};
	private JTextField[] textFelder = new JTextField[daten.length];
	private Map<String, String> neuerNutzerMap = new HashMap<String, String>();

	public JPanel userAnlegen()
	{
		JPanel zeile = new JPanel();
		JPanel userLeiste = new JPanel();
		userLeiste.setLayout(new FlowLayout());
		
		zeile.setLayout(new GridLayout(daten.length+1,2));
		for(int i = 0; i<daten.length; i++)
		{
			zeile.add(new JLabel(daten[i]));
			JTextField input = new JTextField("Hier bitte "+daten[i]+" eingeben.");
			input.setName(daten[i]);
			input.addActionListener(this);
			textFelder[i]=input;
			zeile.add(input);
		}
		
		JButton ok = new JButton("Ok");
		ok.addActionListener(this);
		zeile.add(ok);
		userLeiste.add(zeile);
		
		return userLeiste;
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Ok"))
		{
			for(int i = 0; i < textFelder.length;i ++)
			{
				JTextField feldInhalt= textFelder[i];
				System.out.println(feldInhalt.getText());
				neuerNutzerMap.put(feldInhalt.getName(), feldInhalt.getText());
			}
			nutzerLogik.neuerNutzer(neuerNutzerMap);
		}
	}
}

