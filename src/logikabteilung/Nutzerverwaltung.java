package logikabteilung;
import java.util.Map;
import datenverwaltungsschicht.NutzerDAO;

public class Nutzerverwaltung {
	private NutzerDAO nutzerDAO;
	
	public void neuerNutzer(Map<String, String> neuerUserMap)
	{
		//Eingaben werden verifiziert...
		namenVerifikation(neuerUserMap.get("name"));
		emailVerifikation(neuerUserMap.get("email"));
		passwortVerifikation(neuerUserMap.get("password"));
		
		//Nach bestandener Verifikation wird der neue User angelegt
		Benutzer neuerUser = new Benutzer();
		neuerUser.setName(neuerUserMap.get("name"));
		neuerUser.setEmail(neuerUserMap.get("email"));
		neuerUser.setGeburtstag(neuerUserMap.get("geburtstag"));
		neuerUser.setHausnummer(neuerUserMap.get("hausnummer"));
		neuerUser.setPlz(neuerUserMap.get("plz"));
		neuerUser.setStadt(neuerUserMap.get("stadt"));
		neuerUser.setStrasse(neuerUserMap.get("strasse"));
		neuerUser.setPasswort(neuerUserMap.get("passwort"));
		// User wird gespeichert. 
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
		if(name == "")
		{
			System.out.println("Der Name ist Müll. So wie du!");
			throw new IllegalArgumentException();
		}
	}
	public void emailVerifikation(String email)
	{
		if(!email.contains("@"))
		{
			System.out.println("Das soll ne EmailAdresse sein, du Penner?!");
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
