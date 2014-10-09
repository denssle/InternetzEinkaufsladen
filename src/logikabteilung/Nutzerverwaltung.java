package logikabteilung;
import java.util.HashMap;
import java.util.Map;

import datenverwaltungsschicht.NutzerDAO;

public class Nutzerverwaltung {
	private NutzerDAO nutzerDAO;
	private Map<Integer, Benutzer> alleNutzer = new HashMap<Integer, Benutzer>();
	
	public void neuerNutzer(Map<String, String> neuerUserMap)
	{
		namenVerifikation(neuerUserMap.get("name"));
		emailVerifikation(neuerUserMap.get("email"));
		passwortVerifikation(neuerUserMap.get("password"));
		
		Benutzer neuerUser = new Benutzer();
		neuerUser.setName(neuerUserMap.get("name"));
		neuerUser.setEmail(neuerUserMap.get("email"));
		neuerUser.setGeburtstag(neuerUserMap.get("geburtstag"));
		neuerUser.setHausnummer(neuerUserMap.get("hausnummer"));
		neuerUser.setPlz(neuerUserMap.get("plz"));
		neuerUser.setStadt(neuerUserMap.get("stadt"));
		neuerUser.setStrasse(neuerUserMap.get("strasse"));
		neuerUser.setPasswort(neuerUserMap.get("passwort"));
		//Userverifikation hier!
		
		alleNutzer.put(neuerUser.getId(), neuerUser);
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
		throw new IllegalArgumentException();
	}
}
