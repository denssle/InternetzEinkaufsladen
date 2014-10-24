package view;

import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class EinkaufAnsicht
{
	private Map parameter = new HashMap();
	public JPanel start()
	{
		JPanel main = new JPanel();
		main.setLayout(new FlowLayout());
		
		if(parameter.isEmpty())
		{
			main.add(new JLabel("Es sind keine Artikel vorhanden."));
		}
		
		return main;
	}
}
