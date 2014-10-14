package view;
import java.util.HashMap;
import java.util.Map;

public class RegistrationAnsicht
{
	Eingabe eingabe = new Eingabe();
	
	public Map<String, String> neuerNutzer()
	{
		Map<String, String> neuerNutzerMap = new HashMap<String, String>();
		String[] daten = {"name", "email", "geburtstag", "strasse", "hausnummer", "stadt", "plz", "password"};
		for(int i = 0; i < daten.length; i++)
		{
			System.out.println(daten[i]+"?");
			neuerNutzerMap.put(daten[i],eingabe.einlesenString());
		}
		return neuerNutzerMap;
	}
}

