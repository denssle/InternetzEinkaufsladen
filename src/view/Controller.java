package view;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

import logikabteilung.Nutzerverwaltung;

public class Controller
{
	private Nutzerverwaltung nutzerLogik = new Nutzerverwaltung();
	
	private MenueAnsicht hauptmenue = new MenueAnsicht();
	private LogInAnsicht login = new LogInAnsicht();
	private RegistrationAnsicht registration = new RegistrationAnsicht();
	private KaufAnsicht einkauf = new KaufAnsicht();
	private WarenkorbAnsicht warenkorb = new WarenkorbAnsicht();
	private NutzerAnsicht profil = new NutzerAnsicht();
	
	public void menuedurchlauf()
	{
		int wahl = hauptmenue.auswahlmenue();
		// 0anmelden, 1registrieren, 2einkaufen, 3warenkorb ausgeben, 4profiel, 5ausloggen
		if(wahl == 0)
		{
			//anmelden / login
		}
		else if(wahl == 1)
		{
			while(true)
			{
				try
				{
					Map<String, String> neuerUser = registration.neuerNutzer();
					nutzerLogik.neuerNutzer(neuerUser);
					break;
				}
				catch(IllegalArgumentException e)
				{
					System.out.println("Da lief was schief!");
				}
			}
		}
		else if(wahl == 2)
		{
			// einkaufen
		}
		else if(wahl == 3)
		{
			// aktueller warenkorb
		}
		else if(wahl == 4)
		{
			//profil
		}
		else if(wahl == 5)
		{
			// log out
		}
		else
		{
			// FEHLER!
		}
	}
}
