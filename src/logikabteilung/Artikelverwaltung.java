package logikabteilung;
import java.util.Map;

import datenverwaltungsschicht.ArtikelDAO;


public class Artikelverwaltung
{
	private ArtikelDAO artikelDAO = new ArtikelDAO();
	
	public void artikelSpeichern(Map neuerArtikelMap)
	{
		kategorieVerifikation((String) neuerArtikelMap.get("kategorie"));
		namensVerifikation((String) neuerArtikelMap.get("name"));
		preisVerifikation((double) neuerArtikelMap.get("preis"));
		
		Artikel zuSpeichernderArtikel = new Artikel();
		zuSpeichernderArtikel.setBeschreibung((String) neuerArtikelMap.get("beschreibung"));
		zuSpeichernderArtikel.setKategorie((String) neuerArtikelMap.get("kategorie"));
		zuSpeichernderArtikel.setName((String) neuerArtikelMap.get("name"));
		zuSpeichernderArtikel.setPreis((double) neuerArtikelMap.get("preis"));
		artikelDAO.speichern(zuSpeichernderArtikel);
	}
	
	public void kategorieVerifikation(String kategorie)
	{
		if(kategorie.isEmpty())
		{
			throw new IllegalArgumentException();
		}
	}
	public void namensVerifikation(String name)
	{
		if(name.isEmpty())
		{
			throw new IllegalArgumentException();
		}
	}
	public void preisVerifikation(double preis)
	{
		if(preis <= 0)
		{
			throw new IllegalArgumentException();
		}
	}
}
