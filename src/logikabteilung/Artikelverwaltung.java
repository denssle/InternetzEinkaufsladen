package logikabteilung;
import java.util.Map;

import datenverwaltungsschicht.ArtikelDAO;


public class Artikelverwaltung
{
	private ArtikelDAO artikelDAO = new ArtikelDAO();
	
	public void artikelSpeichern(Map neuerArtikelMap)
	{
		Artikel zuSpeichernderArtikel = new Artikel();
		zuSpeichernderArtikel.setBeschreibung((String) neuerArtikelMap.get("beschreibung"));
		zuSpeichernderArtikel.setKategorie((String) neuerArtikelMap.get("kategorie"));
		zuSpeichernderArtikel.setName((String) neuerArtikelMap.get("name"));
		zuSpeichernderArtikel.setPreis((double) neuerArtikelMap.get("beschreibung"));
		artikelDAO.speichern(zuSpeichernderArtikel);
	}
}
