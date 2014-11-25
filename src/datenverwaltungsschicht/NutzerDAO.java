package datenverwaltungsschicht;
import logikabteilung.Artikel;
import logikabteilung.Benutzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NutzerDAO
{
	private String pfad = "/Users/admin/Dropbox/FH/benutzerSpeicherOrt.txt";
	private File benutzerSpeicherOrt = new File(pfad);
	private Map<Integer, Benutzer> alleNutzer = alteBenutzerAuslesen();
	
	private Map<Integer, Benutzer> alteBenutzerAuslesen()
	{
		validiereSpeicher();
		
		Map<Integer, Benutzer> ausgeleseneBenutzer;
		try
		{
			FileInputStream fs = new FileInputStream(pfad);
			ObjectInputStream is = new ObjectInputStream(fs);
			ausgeleseneBenutzer = (Map<Integer, Benutzer>) is.readObject();
			is.close();
		}
		catch (IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
			ausgeleseneBenutzer = new HashMap<Integer, Benutzer>();
		}
		return ausgeleseneBenutzer;
	}
	private void validiereSpeicher()
	{
		System.out.println("Benutzerspeichervalidierung gestartet!");

		if(!benutzerSpeicherOrt.exists())
        {
			System.out.println("Benutzerdatei nicht vorhanden.");
            try
            {
                boolean wurdeErstellt = benutzerSpeicherOrt.createNewFile();
                if(wurdeErstellt)
                {
                    System.out.println("Benutzerdatei erstellt.");
                }
                else
                {
                    System.out.println("Benutzerdatei konnte nicht erstellt werden!");
                }
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
		System.out.println("Datei gefunden!\nValidierung erfolgreich!");
	}
	public void bearbeiten(Benutzer zuBearbeitenderUser)
	{
		//return true;
	}

	public void entfernen(Benutzer zuEntfernenderUser)
	{
		
	}

	public void speichern(Benutzer zuSpeichernderUser)
	{
		validiereSpeicher();
		
		try
		{
			alleNutzer.put(zuSpeichernderUser.getId(), zuSpeichernderUser);
			FileOutputStream fs = new FileOutputStream(pfad);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			System.out.println("fs und os sind bereit!");
			os.writeObject(alleNutzer);
			os.close();
			System.out.println("os wird geschlossen!");
			System.out.println(zuSpeichernderUser.getName() + " wurde gespeichert.\n");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
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
