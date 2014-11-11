package view;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Ladebalken
{
	private static int start = 0;
	private static int ende = 100;
	static JProgressBar bar = new JProgressBar(start, ende);
	
	public JPanel ladevorgang()
	{
		bar.setValue(0);
		bar.setVisible(true);
		JPanel laden = new JPanel();
		laden.setLayout(new FlowLayout());
		
		for(int i=0; i<= ende; i++)
		{
			bar.setValue(i);
			bar.setString("Fortschritt: "+i+"%");
			
		}
		laden.add(bar);
		return laden;
	}
}
