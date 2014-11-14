package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import logikabteilung.Artikelverwaltung;
import logikabteilung.Benutzerverwaltung;
import view.LogInAnsicht;


public class Controller implements ActionListener 
{
	private LogInAnsicht login = new LogInAnsicht();
	private EinkaufAnsicht einkauf = new EinkaufAnsicht();
	private WarenkorbAnsicht warenkorb = new WarenkorbAnsicht();
	private BenutzerAnsicht profil = new BenutzerAnsicht();
	private VerwaltungsAnsicht verwaltung = new VerwaltungsAnsicht();
	private static JPanel mainPanel = new JPanel(); 	
	
	public void start()
	{
		JFrame frame = new JFrame("InternetzLaden");
		JPanel ausgabe =  new JPanel();
		JPanel statusleiste = menueLeisteErstellen();
		frame.setSize(800,800);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)((d.width - frame.getSize().width) / 2);
		int y = (int)((d.height - frame.getSize().height) / 2);
		frame.setLocation(x, y);
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		
		mainPanel.setLayout(new BorderLayout());
		mainPanel.setBackground(new Color(100,100,100));
		mainPanel.add("West", statusleiste);
		mainPanel.add("Center", ausgabe);
		
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	private JPanel menueLeisteErstellen()
	{
		String[] buttonlabels = {
				"Anmelden", 
				"Einkaufen", 
				"Profil", 
				"Verwaltung", 
				"Leer"};
		JPanel leiste = new JPanel();
		
		leiste.setLayout(new GridLayout(5,1));
		leiste.setPreferredSize(new Dimension(200, 600));
		
		for(int i = 0; i<buttonlabels.length; i++)
		{
			JButton neuerButton = new JButton(buttonlabels[i]);
			neuerButton.addActionListener(this);
			leiste.add(neuerButton);
		}
		
		return leiste;
	}
	
	public static void viewWechseln(JPanel neueView)
	{
		mainPanel.remove(1);
		mainPanel.add("Center", neueView);
		mainPanel.validate();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JPanel menuePanel = new JPanel();
		String Befehl = e.getActionCommand();
		if (Befehl.equals("Anmelden"))
		{
			menuePanel = login.anmelden();
		}
		else if(Befehl.equals("Einkaufen"))
		{
			menuePanel = einkauf.startMenue();
		}
		else if(Befehl.equals("Profil"))
		{
			menuePanel = profil.profilAusgeben();
		}
		else if(Befehl.equals("Verwaltung"))
		{
			menuePanel = verwaltung.startMenue();
		}
		viewWechseln(menuePanel);
	}
}
	
