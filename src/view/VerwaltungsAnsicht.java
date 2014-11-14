package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VerwaltungsAnsicht implements ActionListener 
{
	private ArtikelCRUD artikelView = new ArtikelCRUD();
	private String[] beschriftungen = {"Buch hinzufügen"};
	
	public JPanel startMenue()
	{
		JPanel verwaltungsView = new JPanel();
		verwaltungsView.setLayout(new FlowLayout());
		
		for(int i = 0; i < beschriftungen.length; i++)
		{
			JPanel zeile = new JPanel();
			zeile.setLayout(new GridLayout());
			zeile.add(new JLabel(beschriftungen[i]));
			JButton klick = new JButton("Klick");
			klick.setName(beschriftungen[i]);
			klick.addActionListener(this);
			
			zeile.add(klick);
			verwaltungsView.add(zeile);
		}		
		return verwaltungsView; 
		//artikelView.anzeigen();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String eingave = e.getActionCommand();
		if (eingave.equals("Klick"))
		{
			Controller.viewWechseln(artikelView.anzeigen());
		}
	}

}
