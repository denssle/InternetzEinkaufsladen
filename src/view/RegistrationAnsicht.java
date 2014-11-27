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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logikabteilung.Benutzerverwaltung;

public class RegistrationAnsicht implements ActionListener
{	
	private String[] daten = {"Name", "Email", "Geburtstag", "Strasse", "Hausnummer", "Stadt", "Postleitzahl", "Passwort"};
	private JTextField[] textFelder = new JTextField[daten.length];
	private Map<String, String> neuerNutzerMap = new HashMap<String, String>();
	private Benutzerverwaltung nutzerLogik = null;
	
	public JPanel userAnlegen(Benutzerverwaltung nutzerLogik)
	{
		this.nutzerLogik = nutzerLogik;
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
			try
			{
				nutzerLogik.neuerNutzer(neuerNutzerMap);
				JOptionPane.showMessageDialog(null,Benutzerverwaltung.getAktuellerBenuzer().getName()+" hat sich angemeldet.");
				Controller.viewWechseln(new JPanel());
			}
			catch(IllegalArgumentException error)
			{
				JOptionPane.showMessageDialog(null,error.getMessage());
			}
		}
	}
}

