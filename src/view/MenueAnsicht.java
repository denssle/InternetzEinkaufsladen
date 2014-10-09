package view;
import logikabteilung.Eingabe;
import java.util.InputMismatchException;

public class MenueAnsicht
{
	Eingabe eingabe = new Eingabe();
	
	public int auswahlmenue()
	{
		System.out.println("Hauptmenue, wie kann ich ihnen helfen?");
		System.out.println("0anmelden, \n1registrieren, \n2einkaufen, \n3warenkorb, \n4ausgeben, \n5profiel, \n6profiel bearbeiten, \n7artikel erstellen, \nartikel entfernen, 8logout");
		int auswahl = eingabe.einlesenInt();	
		
		try
		{
			if(auswahl > 8)
			{
				throw new InputMismatchException();
			}
			return auswahl;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Was glauben warum vor den Auswahlmöglichkeiten Ziffern stehen?\nVersuchen Sies noch mal.\n");
			return auswahlmenue();
		}		
	}
}
