package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HauptmenueAnsicht
{
	Eingabe eingabe = new Eingabe();
	
	public void auswahlmenue()
	{
		JFrame frame = new JFrame("InternetzLaden");
		frame.setSize(600,600);
		frame.setLocation(10,10);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		
		JPanel leiste = new JPanel();
		leiste.setLayout(new GridLayout(4,1));
		leiste.setBackground(new Color(50,50,50));
		leiste.add(new JButton("Anmelden"));
		leiste.add(new JButton("Registrieren"));
		leiste.add(new JButton("Einkaufen"));
		leiste.add(new JButton("Profil"));
		
		JPanel ausgabe = new JPanel();
		ausgabe.setLayout(new GridLayout());
		ausgabe.setBackground(new Color(200,200,200));
		
		mainPanel.add("West", leiste);
		mainPanel.add("East", ausgabe);
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
