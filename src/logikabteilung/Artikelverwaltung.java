package logikabteilung;
import java.util.Map;

import datenverwaltungsschicht.ArtikelDAO;


public class Artikelverwaltung
{
	private static ArtikelDAO artikelDAO = new ArtikelDAO();
	private static int artikelanzahl = artikelDAO.artikelAnzahl();
	
	public void artikelSpeichern(Map neuerArtikelMap)
	{
		kategorieVerifikation((String) neuerArtikelMap.get("Kategorie"));
		namensVerifikation((String) neuerArtikelMap.get("Artikelname")+" ");
		double zahl = Double.parseDouble((String) neuerArtikelMap.get("Preis"));
		preisVerifikation(zahl);
		
		Artikel zuSpeichernderArtikel = new Artikel();
		zuSpeichernderArtikel.setArtikelId(artikelanzahl++);
		zuSpeichernderArtikel.setBeschreibung((String) neuerArtikelMap.get("Beschreibung"));
		zuSpeichernderArtikel.setKategorie((String) neuerArtikelMap.get("Kategorie"));
		zuSpeichernderArtikel.setName((String) neuerArtikelMap.get("Artikelname"));
		zuSpeichernderArtikel.setPreis(zahl);
		artikelDAO.speichern(zuSpeichernderArtikel);
	}
	
	private void kategorieVerifikation(String kategorie)
	{
		if(kategorie.isEmpty())
		{
			throw new IllegalArgumentException("Wie hast du das denn geschafft?!");
		}
	}
	private void namensVerifikation(String name)
	{
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Kein Name?!");
		}
	}
	private void preisVerifikation(double preis)
	{
		if(preis <= 0)
		{
			throw new IllegalArgumentException("Umsonst ist nicht!");
		}
	}
	public Map getAlleArtikel()
	{
		return artikelDAO.getAlleArtikel();
	}
}
