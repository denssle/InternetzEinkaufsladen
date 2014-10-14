package datenverwaltungsschicht;
import java.util.HashMap;
import java.util.Map;

import logikabteilung.Artikel;

public class ArtikelDAO
{
	private Map<Integer, Artikel> alleArtikel = new HashMap<Integer, Artikel>();
	
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
		System.out.println(zuSpeichernderArtikel.getName() + " wurde gespeichert.\n");
		alleArtikel.put(zuSpeichernderArtikel.getArtikelId(), zuSpeichernderArtikel);
	}

}
