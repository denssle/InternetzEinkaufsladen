package logikabteilung;
import java.util.*;

public class Warenkorb
{
	private List<ArtikelModel> inhalt = new LinkedList<ArtikelModel>();
	
	public List<ArtikelModel> getInhalt()
	{
		return inhalt;
	}
	public void addInhalt(ArtikelModel neuerArtikel)
	{
		inhalt.add(neuerArtikel);
	}
}
