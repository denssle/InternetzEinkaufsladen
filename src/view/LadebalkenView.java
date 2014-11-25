package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LadebalkenView
{
	public static void ladevorgang(String text)
	{
		JPanel main = new JPanel();
		main.setLayout(new GridLayout());
		
		JPanel ueberschrift = new JPanel();
		ueberschrift.setLayout(new FlowLayout());
		ueberschrift.add(new JLabel(text));
		
		JPanel vorgang = new JPanel();
		
		main.add(ueberschrift);
		main.add(vorgang);
		
		Controller.viewWechseln(main);
	}
}
