package view;
import logikabteilung.Eingabe;

import java.util.HashMap;
import java.util.Map;

public class ArtikelCRUD
{
	Eingabe eingabe = new Eingabe();
	
	public Map erstellen()
	{
		Map<String, Comparable> neuerArtikelMap = new HashMap<String, Comparable>();
		System.out.println("Name des Artikels, bitte:");
		neuerArtikelMap.put("name", eingabe.einlesenString());
		
		System.out.println("Preis des Artikels, bitte:");
		neuerArtikelMap.put("preis", eingabe.einlesenDouble());
		
		System.out.println("Beschreibung des Artikels, bitte:");
		neuerArtikelMap.put("beschreibung", eingabe.einlesenString());
		
		System.out.println("Kategorie des Artikels, bitte:");
		neuerArtikelMap.put("kategorie", eingabe.einlesenString());
		
		return neuerArtikelMap;
	}
}
