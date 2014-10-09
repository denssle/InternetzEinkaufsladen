package logikabteilung;
import java.util.HashMap;
import java.util.Map;

import datenverwaltungsschicht.NutzerDAO;

public class Nutzerverwaltung {
	private NutzerDAO nutzerDAO;
	private Map<Integer, Benutzer> alleNutzer = new HashMap<Integer, Benutzer>();
	
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
		//Userverifikation hier!
		
		alleNutzer.put(neuerUser.getId(), neuerUser);
		//nutzerDAO.speichern(neuerUser);
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
