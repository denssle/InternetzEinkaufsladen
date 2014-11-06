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

public class RegistrationAnsicht implements ActionListener
{	
	private JPanel zeile = new JPanel();
	
	public Map<String, String> neuerNutzer()
	{
		Map<String, String> neuerNutzerMap = new HashMap<String, String>();
		String[] daten = {"name", "email", "geburtstag", "strasse", "hausnummer", "stadt", "plz", "password"};
		for(int i = 0; i < daten.length; i++)
		{
			System.out.println(daten[i]+"?");
			//neuerNutzerMap.put(daten[i],eingabe.einlesenString());
		}
		return neuerNutzerMap;
	}

	public JPanel userAnlegen()
	{
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		String[] daten = {"Name", "Email", "Geburtstag", "Strasse", "Hausnummer", "Stadt", "Postleitzahl", "Password"};
		
		zeile.setLayout(new GridLayout(daten.length+1,2));
		for(int i = 0; i<daten.length; i++)
		{
			zeile.add(new JLabel(daten[i]));
			JTextField input = new JTextField("Hier bitte "+daten[i]+" eingeben.");
			input.setName("Yeah");
			input.addActionListener(this);
			zeile.add(input);
		}
		
		JButton ok = new JButton("Ok");
		ok.addActionListener(this);
		zeile.add(ok);
		main.add(zeile);
		
		return main;
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Ok"))
		{
			zeile.getComponent(1);
			System.out.println("Button");
		}
		if (e.getActionCommand().equals("Yeah"))
		{
			System.out.println("????");
		}
	}
}

