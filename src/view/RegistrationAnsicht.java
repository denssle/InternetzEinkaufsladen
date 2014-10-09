package view;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 
import java.util.TreeMap;

public class RegistrationAnsicht
{
	public Map<String, String> neuerNutzer()
	{
		Map<String, String> neuerNutzerMap = new HashMap<String, String>();
		String[] daten = {"name", "email", "geburtstag", "strasse", "hausnummer", "stadt", "plz", "password"};
		for(int i = 0; i < daten.length; i++)
		{
			neuerNutzerMap.put(daten[i],einlesen(daten[i]));
		}
		return neuerNutzerMap;
	}
	
	@SuppressWarnings("resource")
	public String einlesen(String gesucht)
	{
		System.out.printf("%S?: ", gesucht);
		Scanner scanner = new Scanner(System.in); 
		String ruckgabe = scanner.next();
        return ruckgabe;
	}
}

