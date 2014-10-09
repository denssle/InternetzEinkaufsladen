package view;
import java.util.Map;
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
	private ArtikelCRUD artikel = new ArtikelCRUD();
	
	public void menuedurchlauf()
	{
		int wahl = hauptmenue.auswahlmenue();
		// 0anmelden, 1registrieren, 2einkaufen, 3warenkorb ausgeben, 4profil, 5profil bearbeiten, 6artikel erstellen, 7 artikel löschen, 8logout
		
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
		else if(wahl == 6)// Artikel erstellen
		{
			artikel.erstellen();
		}
		else if(wahl == 8)// logout
		{
			System.out.println("Bye.");
		}
	}
}
