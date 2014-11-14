package logikabteilung;
import java.util.Map;
import datenverwaltungsschicht.ArtikelDAO;


public class Artikelverwaltung
{
	private ArtikelDAO artikelDAO = new ArtikelDAO();
	private static int artikelanzahl;
	
	public void artikelSpeichern(Map neuerArtikelMap)
	{
		kategorieVerifikation((String) neuerArtikelMap.get("kategorie"));
		namensVerifikation((String) neuerArtikelMap.get("name"));
		preisVerifikation((double) neuerArtikelMap.get("preis"));
		
		Artikel zuSpeichernderArtikel = new Artikel();
		zuSpeichernderArtikel.setArtikelId(artikelanzahl++);
		zuSpeichernderArtikel.setBeschreibung((String) neuerArtikelMap.get("beschreibung"));
		zuSpeichernderArtikel.setKategorie((String) neuerArtikelMap.get("kategorie"));
		zuSpeichernderArtikel.setName((String) neuerArtikelMap.get("name"));
		zuSpeichernderArtikel.setPreis((double) neuerArtikelMap.get("preis"));
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
