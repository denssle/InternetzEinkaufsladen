package view;
import java.util.InputMismatchException;

public class HauptmenueAnsicht
{
	Eingabe eingabe = new Eingabe();
	
	public int auswahlmenue()
	{
		System.out.println("Hauptmenue, wie kann ich ihnen helfen?");
		System.out.println("0anmelden, \n1registrieren, \n2einkaufen, \n3warenkorb, \n4ausgeben, \n5profiel, \n6profiel bearbeiten, \n7artikel erstellen, \n8artikel entfernen, 9logout");

		int auswahl = eingabe.einlesenInt();
		
		try
		{
			if(auswahl > 9)
			{
				throw new InputMismatchException();
			}
			return auswahl;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Was glauben Sie warum vor den Auswahlmöglichkeiten Ziffern stehen?\nVersuchen Sie es noch mal.\n");
			return auswahlmenue();
		}		
	}
}
