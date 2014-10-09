package view;

import java.util.Scanner;

public class MenueAnsicht
{
	public int auswahlmenue()
	{
		System.out.println("Hauptmenue, wie kann ich ihnen helfen?");
		System.out.println("0anmelden, \n1registrieren, \n2einkaufen, \n3warenkorb, \n4ausgeben, \n5profiel, \n6ausloggen");
		int auswahl = einlesen();		
		
		return auswahl;
		
	}
	
	public int einlesen()
	{
		Scanner scanner = new Scanner(System.in); 
		String eingabe = scanner.next();
		int ruckgabe;
        try
        {
        	ruckgabe = Integer.parseInt(eingabe);
        }
        catch(NumberFormatException e)
        {
        	System.out.println("Da lief was schief, bitte versuchen Sie es erneut!");
        	ruckgabe = einlesen();
        }
        return ruckgabe;
	}
}
