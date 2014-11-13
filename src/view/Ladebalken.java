package view;

import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Ladebalken
{
	private static int start = 0;
	private static int ende = 100;
	static JProgressBar bar = new JProgressBar(start, ende);
	
	public JPanel ladevorgangInit()
	{
		bar.setValue(0);
		bar.setStringPainted(true);
		JPanel laden = new JPanel();
		laden.setLayout(new FlowLayout());
		
		laden.add(bar);
		return laden;
	}
	
	public void ladevorgangUpdate()
	{
		for(int i=1; i<= bar.getMaximum(); i++)
		{
			bar.setValue(i);
			bar.setString("Fortschritt: "+i+"%");
			try 
			{
				Thread.sleep(50);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
