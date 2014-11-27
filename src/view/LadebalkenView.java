package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class LadebalkenView
{
	private static JProgressBar progressBar = new JProgressBar();
	private static JLabel beschriftung = new JLabel();
	
	public static JPanel ladevorgangInit()
	{
		JPanel main = new JPanel();
		main.setLayout(new GridLayout());
		
		JPanel statusLabel = new JPanel();
		statusLabel.setLayout(new FlowLayout());
		
		statusLabel.add(beschriftung);
		
		JPanel vorgang = new JPanel();
		
		progressBar.setValue(0);
	    progressBar.setIndeterminate(true);
	    vorgang.add(progressBar);
	    
		main.add(statusLabel);
		main.add(vorgang);
		
		return main;
	}
	public static void ladevorgangStart(String[] ladeTexte)
	{
		int schritte = 100 / ladeTexte.length;
		int j = schritte;
		for(int i=0; i<ladeTexte.length; i++)
		{
			progressBar.setValue(j);
			j += schritte;
			beschriftung.setText(ladeTexte[i]);
		}	
		
		progressBar.setValue(100);
	}
}
