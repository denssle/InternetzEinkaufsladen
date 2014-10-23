package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class HauptmenueAnsicht
{
	Eingabe eingabe = new Eingabe();
	
	public JPanel auswahlmenue()
	{	
		JPanel leiste = new JPanel();
		leiste.setLayout(new GridLayout(5,1));
		leiste.setBackground(new Color(100,100,100));
		leiste.setPreferredSize(new Dimension(200, 600));
		leiste.add(new JButton("Anmelden"));
		leiste.add(new JButton("Registrieren"));
		leiste.add(new JButton("Einkaufen"));
		leiste.add(new JButton("Profil"));
		leiste.add(new JButton("Verwaltung"));
		
		return leiste;
	}
}
