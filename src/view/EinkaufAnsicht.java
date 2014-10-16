package view;

import java.util.Map;
import logikabteilung.Artikel;

public class EinkaufAnsicht
{
	Map<Integer, Artikel> warenliste;
	public void startseite(Map<Integer, Artikel> warenliste)
	{
		this.warenliste = warenliste;
		while(true)
		{
			System.out.println("Was darfs denn sein?");
		}
	}
	
	public void warenlisteZeigen()
	{
		if(warenliste.isEmpty())
		{
			System.out.println("Nichts da!");
		}
		else
		{
			warenliste.forEach( (id,artikel) -> System.out.println("ID: " + id + ": Artikel: " + artikel.getName()));
		}
	}
	
	public void detailansicht()
	{
		//do do
	}
	
	public void inDenWarenkorb()
	{
		// do do do
	}
}
