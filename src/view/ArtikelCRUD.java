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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArtikelCRUD implements ActionListener 
{
	public JPanel anzeigen()
	{
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		
		JPanel zeileN = new JPanel();
		zeileN.setLayout(new GridLayout(1,2));
		zeileN.add(new JLabel("Artikelname:"));
		zeileN.add(new JTextField("Name"));
		
		JPanel zeileP = new JPanel();
		zeileP.setLayout(new GridLayout(1,2));
		zeileP.add(new JLabel("Preis des Artikels:"));
		zeileP.add(new JTextField("Preis"));
		
		JPanel zeileB = new JPanel();
		zeileB.setLayout(new GridLayout(1,2));
		zeileB.add(new JLabel("Beschreibung:"));
		zeileB.add(new JTextField("Beschreibung"));
		
		JPanel zeileK = new JPanel();
		zeileK.setLayout(new GridLayout(1,2));
		zeileK.add(new JLabel("Kategorie:"));
		String[] artikelKategorien = {"Buch", "TabletPC"};
		JComboBox<String> moeglicheKategorien = new JComboBox<String>(artikelKategorien);
		zeileK.add(moeglicheKategorien);
		
		JPanel buttonPanel = new JPanel();
		JButton button = new JButton("Ok");
		button.addActionListener(this);
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(button);
		
		
		
		JPanel[] panelArray = {zeileN, zeileP, zeileB, zeileK,buttonPanel};
		JPanel zwischenschritt = new JPanel();
		zwischenschritt.setLayout(new GridLayout(panelArray.length+1,2));
		for(int i=0; i<panelArray.length; i++)
		{
			zwischenschritt.add(panelArray[i]);
		}
		
		main.add(zwischenschritt);
		return main;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String eingabe = e.getActionCommand();

		if (eingabe.equals("Ok"))
		{
			System.out.println("X");
		}
		
	}
}
