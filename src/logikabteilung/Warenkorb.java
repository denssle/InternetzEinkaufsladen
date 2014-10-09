package logikabteilung;
import java.util.*;

public class Warenkorb
{
	private List<Artikel> inhalt = new LinkedList<Artikel>();
	
	public List<Artikel> getInhalt()
	{
		return inhalt;
	}
	public void addInhalt(Artikel neuerArtikel)
	{
		inhalt.add(neuerArtikel);
	}
}
