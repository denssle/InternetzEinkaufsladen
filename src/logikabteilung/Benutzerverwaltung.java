package logikabteilung;
import java.util.Map;
import datenverwaltungsschicht.BenutzerDAO;
import logikabteilung.Benutzer;

public class Benutzerverwaltung
{
	private BenutzerDAO benutzerDAO = new BenutzerDAO();
	private int userzahl = benutzerDAO.getAnzahlBenutzer();
	private static Benutzer aktuellerUser = null;
	
	public void neuerNutzer(Map<String, String> neuerUserMap)
	{
		//System.out.println(neuerUserMap);
		//Eingaben werden verifiziert...
		namenVerifikation(neuerUserMap.get("Name"));
		emailVerifikation(neuerUserMap.get("Email"));
		passwortVerifikation(neuerUserMap.get("Passwort"));
		
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
		
		benutzerDAO.speichern(neuerUser);
	}
	
	public void bearbeiteNutzer()
	{
		//to do
	}
	
	public void entferneNutzer()
	{
		//do doo do
	}
	public static Benutzer getAktuellerBenuzer()
	{
		return aktuellerUser;
	}
	public String anmelden(String email, String passwort)
	{
		Benutzer anmeldeversuch = benutzerDAO.anmeldeVersuch(email, passwort);
		if(anmeldeversuch!= null)
			{
				aktuellerUser=anmeldeversuch;
				return("Anmeldung erfolgreich.");
			}
		return("Es wurde kein passender User gefunden.");
	}
	public void abmelden()
	{
		
	}
	private void namenVerifikation(String name)
	{
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Der Name ist Müll. So wie Sie!");
		}
	}
	private void emailVerifikation(String email)
	{
		if(!email.contains("@") || !email.contains("."))
		{
			throw new IllegalArgumentException("Das soll ne EmailAdresse sein, Sie Versager?!");
		}
	}
	private void passwortVerifikation(String passwort)
	{
		if(passwort.isEmpty() || passwort.length() < 4)
		{
			throw new IllegalArgumentException("Schlechtestes Passwort ever!");
		}
	}
}
