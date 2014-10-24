package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EinkaufAnsicht
{	
	public JPanel start()
	{
		Map<Integer, String> artikelMap = new HashMap<Integer, String>();
		for(int i = 1; i < 100; i++)
		{
			artikelMap.put(i, "value"+i);
		}
		
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		
		if(artikelMap.isEmpty())
		{
			main.add(new JLabel("Es sind keine Artikel vorhanden."));
		}
		else
		{
			JPanel zeile = new JPanel();
			zeile.setLayout(new GridLayout(artikelMap.size()+1, 3));
			zeile.add(new JLabel("Artikelnummer: "));
			zeile.add(new JLabel("Artikel: "));
			zeile.add(new JLabel("Details: "));
			
			Iterator iterator = artikelMap.entrySet().iterator();
			while(iterator.hasNext())
			{
				Map.Entry pairs = (Map.Entry)iterator.next();
		        String key = pairs.getKey().toString();
		        String value = pairs.getValue().toString();
		        zeile.add(new JLabel(key));
		        zeile.add(new JLabel(value));
		        zeile.add(new JButton("Details"));
			}
			main.add(zeile);
		}
		return main;
	}
}
