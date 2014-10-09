package datenverwaltungsschicht;
import logikabteilung.Benutzer;

public class NutzerDAO
{
	public void bearbeiten(Benutzer zuBearbeitenderUser)
	{
		//return true;
	}

	public void entfernen(Benutzer zuEntfernenderUser)
	{
		//return true;
	}

	public void speichern(Benutzer zuSpeichernderUser)
	{
		System.out.print(zuSpeichernderUser.getName() + " wurde gespeichert.");
	}

}
