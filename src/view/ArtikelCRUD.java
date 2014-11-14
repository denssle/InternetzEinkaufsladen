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
	private String[] beschriftungen = {"Artikelname", "Preis", "Beschreibung"};
	public JPanel anzeigen()
	{
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		
		JPanel zeile = new JPanel();
		zeile.setLayout(new GridLayout(beschriftungen.length+2,2));
		for(int i = 0; i<beschriftungen.length; i++)
		{
			zeile.add(new JLabel(beschriftungen[i]));
			JTextField zeilenText = new JTextField(beschriftungen[i]);
			zeilenText.addActionListener(this);
			zeile.add(zeilenText);
		}
		
		zeile.add(new JLabel("Kategorie:"));
		String[] artikelKategorien = {"Buch", "TabletPC"};
		JComboBox<String> moeglicheKategorien = new JComboBox<String>(artikelKategorien);
		zeile.add(moeglicheKategorien);
		
		JButton button = new JButton("Ok");
		button.addActionListener(this);
		zeile.add(button);
		
		JPanel[] panelArray = {zeile, zeile, zeile, zeile,zeile};
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
