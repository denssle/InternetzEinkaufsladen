package logikabteilung;
import java.util.Map;
import datenverwaltungsschicht.NutzerDAO;
import logikabteilung.Benutzer;

public class Benutzerverwaltung {
	private NutzerDAO nutzerDAO = new NutzerDAO();
	private static int userzahl;
	private Benutzer aktuellerUser = new Benutzer();
	
	public void neuerNutzer(Map<String, String> neuerUserMap)
	{
		System.out.println(neuerUserMap);
		//Eingaben werden verifiziert...
		namenVerifikation(neuerUserMap.get("Name"));
		emailVerifikation(neuerUserMap.get("Email"));
		passwortVerifikation(neuerUserMap.get("Password"));
		
		//Nach bestandener Verifikation wird der neue User angelegt
		Benutzer neuerUser = new Benutzer();
		neuerUser.setId(userzahl++);
		neuerUser.setName(neuerUserMap.get("Name"));
		neuerUser.setEmail(neuerUserMap.get("Email"));
		neuerUser.setGeburtstag(neuerUserMap.get("Geburtstag"));
		neuerUser.setHausnummer(neuerUserMap.get("Hausnummer"));
		neuerUser.setPlz(neuerUserMap.get("Postleitzahl"));
		neuerUser.setStadt(neuerUserMap.get("Stadt"));
		neuerUser.setStrasse(neuerUserMap.get("Strasse"));
		neuerUser.setPasswort(neuerUserMap.get("Passwort"));
		
		aktuellerUser = neuerUser;
		
		nutzerDAO.speichern(neuerUser);
	}
	
	public void bearbeiteNutzer()
	{
		//to do
	}
	
	public void entferneNutzer()
	{
		//do doo do
	}
	
	public void namenVerifikation(String name)
	{
		if(name.isEmpty())
		{
			System.out.println("Der Name ist Müll. So wie Sie!");
			throw new IllegalArgumentException();
		}
	}
	public void emailVerifikation(String email)
	{
		if(!email.contains("@") && !email.contains("."))
		{
			System.out.println("Das soll ne EmailAdresse sein, Sie Versager?!");
			throw new IllegalArgumentException();
		}
		
	}
	public void passwortVerifikation(String passwort)
	{
		if(passwort.isEmpty())
		{
			System.out.println("Schlechtestes Passwort ever!");
			throw new IllegalArgumentException();
		}
	}
}
