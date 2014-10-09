package logikabteilung;
import datenverwaltungsschicht.ArtikelDAO;


public class Artikelverwaltung
{
	private ArtikelDAO artikelDAO;
	static int zaehler = 0;
	
	public void artikelErstellen(int newID)
	{
		Artikel neuerArtikel = new Artikel();
		neuerArtikel.setArtikelId(zaehler++);
		
		if(artikelDAO.speichern(neuerArtikel) == true)
		{
			System.out.println("Speichern erfolgreich.");
		}
		else
		{
			System.out.println("Speichern gescheitert");
		}
	}
	public void artikelEntfernen()
	{
		/* do something*/
	}
}
