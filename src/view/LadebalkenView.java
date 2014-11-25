package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LadebalkenView
{
	public static void ladevorgang(String text)
	{
		JPanel main = new JPanel();
		main.add(new JLabel(text));
		Controller.viewWechseln(main);
	}
}
