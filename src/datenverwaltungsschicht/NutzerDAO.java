package datenverwaltungsschicht;
import logikabteilung.Benutzer;

import java.util.HashMap;
import java.util.Map;

public class NutzerDAO
{
	private Map<Integer, Benutzer> alleNutzer = new HashMap<Integer, Benutzer>();
	
	public void bearbeiten(Benutzer zuBearbeitenderUser)
	{
		//return true;
	}

	public void entfernen(Benutzer zuEntfernenderUser)
	{
		//return true;
	}

	public void speichern(Benutzer zuSpeichernderUser)
	{
		System.out.print(zuSpeichernderUser.getName() + " wurde gespeichert.\n");
		alleNutzer.put(zuSpeichernderUser.getId(), zuSpeichernderUser);
	}

	public Map<Integer, Benutzer> getAlleNutzer()
	{
		return alleNutzer;
	}
}
