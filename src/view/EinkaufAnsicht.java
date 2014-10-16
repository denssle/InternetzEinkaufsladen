package view;

import java.util.Map;
import logikabteilung.Artikel;

public class EinkaufAnsicht
{
	public void startseite(Map<Integer, Artikel> map)
	{
		if(map.isEmpty())
		{
			System.out.println("Nichts da!");
		}
		else
		{
			map.forEach( (id,artikel) -> System.out.println("ID: " + id + ": Artikel: " + artikel.getName()));
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
