package view;

public class LogInAnsicht
{
	Eingabe eingabe = new Eingabe();
	
	public void anmelden()
	{
		System.out.println("Ihre Email?");
		String email = eingabe.einlesenString();
		
		System.out.println("Ihr Passwort?");
		String passwort = eingabe.einlesenString();
	}
}
