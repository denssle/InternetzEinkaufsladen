package view;
import java.util.Map;
import logikabteilung.Nutzerverwaltung;
import logikabteilung.Artikelverwaltung;
import logikabteilung.Eingabe;
import logikabteilung.Benutzer;
public class Controller
{
	private Nutzerverwaltung nutzerLogik = new Nutzerverwaltung();
	private Artikelverwaltung artikelLogik = new Artikelverwaltung();
	
	private Eingabe input = new Eingabe();
	private Benutzer aktuellerNutzer = new Benutzer();
	
	private HauptmenueAnsicht hauptmenue = new HauptmenueAnsicht();
	private LogInAnsicht login = new LogInAnsicht();
	private RegistrationAnsicht registration = new RegistrationAnsicht();
	private KaufAnsicht einkauf = new KaufAnsicht();
	private WarenkorbAnsicht warenkorb = new WarenkorbAnsicht();
	private NutzerAnsicht profil = new NutzerAnsicht();
	private ArtikelCRUD artikel = new ArtikelCRUD();
	
	public void menuedurchlauf()
	{
		while(true)
		{
			int wahl = hauptmenue.auswahlmenue();
			// "0anmelden, \n1registrieren, \n2einkaufen, \n3warenkorb, \n4ausgeben, \n5profiel, \n6profiel bearbeiten, \n7artikel erstellen, \n8artikel entfernen, 9logout
			
			if(wahl == 0)//anmelden
			{
				if(aktuellerNutzer == null)
				{
					login.anmelden();
				}
				else
				{
					System.out.println("Sie sind bereits angemeldet. \nTrottel!\n");
				}
			}
			else if(wahl == 1)//registrieren
			{
				if(aktuellerNutzer == null)
				{
					while(true)
					{
						try
						{
							Map<String, String> neuerUser = registration.neuerNutzer();
							aktuellerNutzer = nutzerLogik.neuerNutzer(neuerUser);
							break;
						}
						catch(IllegalArgumentException e)
						{
							System.out.println("Jetzt dürfen Sie alles erneut eingeben. Viel Spaß!");
						}
					}
				}
				else
				{
					System.out.println("Sie sind bereits angemeldet und damit registriert. \nTrottel!\n");
				}
			}
			else if(wahl == 7)// Artikel erstellen
			{
				artikelLogik.artikelSpeichern(artikel.erstellen());
			}
			else if(wahl == 8)// logout
			{
				System.out.println("Auf Nimmerwiedersehen "+aktuellerNutzer.getName()+"!");
				input.close();
				break;
			}
		}
	}
}
