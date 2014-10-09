package logikabteilung;
import java.util.Scanner;

public class Eingabe
{
	Scanner scanner = new Scanner(System.in);
	
	public String einlesenString()
	{
		String eingabe = scanner.next();
		return eingabe;
	}
	public int einlesenInt()
	{
		int eingabe = scanner.nextInt();
		return eingabe;
	}
	public void close()
	{
		scanner.close();
	}
}
