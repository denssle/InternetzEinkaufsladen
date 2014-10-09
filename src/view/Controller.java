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
		// 0anmelden, 1registrieren, 2einkaufen, 3warenkorb ausgeben, 4profil, 5profil bearbeiten, 6artikel erstellen, 7 artikel löschen, 8logout
		// profil bearbeiten fehlt
		if(wahl == 0)//anmelden
		{
			
		}
		else if(wahl == 1)//registrieren
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
					System.out.println("Jetzt dürfen Sie alles erneut eingeben. Viel Spaß!");
				}
			}
		}
		else if(wahl == 2)//einkaufen
		{
			// einkaufen
		}
		else if(wahl == 3)// warenkorb anzeigen
		{
			// aktueller warenkorb
		}
		else if(wahl == 4)// profil ausgeben
		{
			//profil
		}
		else if(wahl == 8)// logout
		{
			System.out.println("Bye.");
		}
	}
}
