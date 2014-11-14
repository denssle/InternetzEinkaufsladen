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
	private static JPanel zeile = new JPanel();
	private String[] daten = {"Name", "Email", "Geburtstag", "Strasse", "Hausnummer", "Stadt", "Postleitzahl", "Password"};
	private Map<String, String> neuerNutzerMap = new HashMap<String, String>();

	public JPanel userAnlegen()
	{
		zeile.removeAll();
		JPanel userLeiste = new JPanel();
		userLeiste.setLayout(new FlowLayout());
		
		zeile.setLayout(new GridLayout(daten.length+1,2));
		for(int i = 0; i<daten.length; i++)
		{
			zeile.add(new JLabel(daten[i]));
			JTextField input = new JTextField("Hier bitte "+daten[i]+" eingeben.");
			input.setName(daten[i]);
			input.addActionListener(this);
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
			for(int i = 1; i < zeile.getComponents().length;i +=2)
			{
				JTextField feldInhalt= (JTextField) zeile.getComponents()[i];
				System.out.println(feldInhalt.getText());
				neuerNutzerMap.put(feldInhalt.getName(), feldInhalt.getText());
			}
		}
	}
}

