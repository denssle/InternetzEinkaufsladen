package datenverwaltungsschicht;
import logikabteilung.Benutzer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NutzerDAO
{
	private Map<Integer, Benutzer> alleNutzer = new HashMap<Integer, Benutzer>();
	
	public void bearbeiten(Benutzer zuBearbeitenderUser)
	{
		//return true;
	}

	public void entfernen(Benutzer zuEntfernenderUser)
	{
		
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
	public Benutzer benutzerMailVorhanden(String email)
	{
		for (Entry<Integer, Benutzer> entry : alleNutzer.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		    if(entry.getValue().getEmail().equals(email))
		    {
		    	return entry.getValue();
		    }
		}
		return null;
	}

	public Benutzer benutzerVorhanden(String email, String passwort)
	{
		Benutzer mailBenutzer = benutzerMailVorhanden(email);
		if(mailBenutzer != null)
		{
			if(mailBenutzer.getPasswort().equals(passwort))
			{
				return mailBenutzer;
			}
		}
		return null;
	}
}
