package view;
import java.util.Map;
import logikabteilung.Nutzerverwaltung;
import logikabteilung.Artikelverwaltung;
import logikabteilung.Eingabe;
public class Controller
{
	private Nutzerverwaltung nutzerLogik = new Nutzerverwaltung();
	private Artikelverwaltung artikelLogik = new Artikelverwaltung();
	
	private Eingabe input = new Eingabe();
	
	private MenueAnsicht hauptmenue = new MenueAnsicht();
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
				//todo
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
			else if(wahl == 7)// Artikel erstellen
			{
				artikelLogik.artikelSpeichern(artikel.erstellen());
			}
			else if(wahl == 8)// logout
			{
				System.out.println("Bye.");
				input.close();
				break;
			}
		}
	}
}
