import view.Controller;

public class IntenetzEinkaufsladen
{
	static Controller viewControll = new Controller();
	
	public static void main(String[] args)
	{
		viewControll.start();
	}

}
/*
CARDLAYOUT
EIGENE EXCEPTIONS SCHREIBEN. 
Wiederverwertbare Meneu View für alle views. 
- Daten konnten nicht geladen/ gespeichert werden
- zu oft falsch angemeldet
- preis < 0
- keine bezeichung
- kein name
- ungültiger name / pw
- scanner falsch

Jeder View ein eigener Controller; Package Model, Modelnamen & Viewnamen abpassen. 

*/