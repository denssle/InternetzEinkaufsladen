package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class LadebalkenView
{
	private static JProgressBar progressBar = new JProgressBar();
	
	public static JPanel ladevorgangInit(String text)
	{
		JPanel main = new JPanel();
		main.setLayout(new GridLayout());
		
		JPanel ueberschrift = new JPanel();
		ueberschrift.setLayout(new FlowLayout());
		ueberschrift.add(new JLabel(text));
		
		JPanel vorgang = new JPanel();
		
		progressBar.setValue(0);
	    progressBar.setIndeterminate(true);
	    vorgang.add(progressBar);
	    
		main.add(ueberschrift);
		main.add(vorgang);
		
		return main;
	}
	public static void ladevorgangStart()
	{
		for(int i=0; i<=100; i++)
		{
			progressBar.setValue(i);
		}	
	}
}
