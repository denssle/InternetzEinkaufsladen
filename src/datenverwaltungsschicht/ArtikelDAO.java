package datenverwaltungsschicht;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import logikabteilung.Artikel;

public class ArtikelDAO
{
	private String pfad = "/Users/admin/Dropbox/FH/aktikelSpeicherOrt.txt";
	private File artikelSpeicherOrt = new File(pfad);
	private Map<Integer, Artikel> alleArtikel = alteArtikelAuslesen();
	
	private Map<Integer, Artikel> alteArtikelAuslesen()
	{
		validiereSpeicher();
		
		Map<Integer, Artikel> ausgeleseneArtikel;
		try
		{
			FileInputStream fs = new FileInputStream(pfad);
			ObjectInputStream is = new ObjectInputStream(fs);
			ausgeleseneArtikel = (Map<Integer, Artikel>) is.readObject();
			is.close();
		}
		catch (IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("Datei konnte nicht gelesen werden.");
			ausgeleseneArtikel = new HashMap<Integer, Artikel>();
		}
		return ausgeleseneArtikel;
	}
	public void bearbeiten(Artikel zuBearbeitenderArtikel)
	{
		//return true;
	}

	public void entfernen(Artikel zuEntfernenderArtikel)
	{
		//return true;
	}
	
	public void speichern(Artikel zuSpeichernderArtikel)
	{
		validiereSpeicher();
		
		try
		{
			alleArtikel.put(zuSpeichernderArtikel.getArtikelId(), zuSpeichernderArtikel);
			FileOutputStream fs = new FileOutputStream(pfad);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			System.out.println("fs und os sind bereit!");
			os.writeObject(alleArtikel);
			os.close();
			System.out.println("os wird geschlossen!");
			System.out.println(zuSpeichernderArtikel.getName() + " wurde gespeichert.\n");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void validiereSpeicher()
	{
		System.out.println("Artikelspeichervalidierung gestartet!");

		if(!artikelSpeicherOrt.exists())
        {
			System.out.println("Datei nicht vorhanden.");
            try
            {
                boolean wurdeErstellt = artikelSpeicherOrt.createNewFile();
                if(wurdeErstellt)
                {
                    System.out.println("Datei erstellt.");
                }
                else
                {
                    System.out.println("Datei konnte nicht erstellt werden!");
                }
            }
            catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
		System.out.println("Datei gefunden!\nValidierung erfolgreich!");
	}
	
	public Map getAlleArtikel()
	{
		return alleArtikel;
	}
	
	public int artikelAnzahl()
	{
		return alleArtikel.size();
	}
}
