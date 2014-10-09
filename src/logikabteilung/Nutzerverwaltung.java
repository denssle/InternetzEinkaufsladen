package logikabteilung;
import java.util.Map;

import datenverwaltungsschicht.NutzerDAO;

public class Nutzerverwaltung {
	private NutzerDAO nutzerDAO;
	
	public void neuerNutzer(Map<String, String> neuerUserMap)
	{
		Benutzer neuerUser = new Benutzer();
		neuerUser.setName(neuerUserMap.get("name"));
		neuerUser.setEmail(neuerUserMap.get("email"));
		neuerUser.setGeburtstag(neuerUserMap.get("geburtstag"));
		neuerUser.setHausnummer(neuerUserMap.get("hausnummer"));
		neuerUser.setPlz(neuerUserMap.get("plz"));
		neuerUser.setStadt(neuerUserMap.get("stadt"));
		neuerUser.setStrasse(neuerUserMap.get("strasse"));
		System.out.println("ok");
	}
	
	public void bearbeiteNutzer()
	{
		//to do
	}
	
	public void entferneNutzer()
	{
		//do doo do
	}
}
