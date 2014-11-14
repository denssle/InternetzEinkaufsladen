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
			JTextField zeilenText = new JTextField(beschriftungen[i]);
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

	@Override
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
			System.out.println(moeglicheKategorien.getSelectedObjects());
			neuerArtikelMap.put("Kategorie",moeglicheKategorien.getSelectedObjects().toString());
		}
		
	}
}
