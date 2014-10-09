package logikabteilung;
import java.util.InputMismatchException;
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
		try
		{
			int eingabe = scanner.nextInt();
			return eingabe;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Fehlerhafte Eingabe!");
			return einlesenInt();
		}
	}
	public double einlesenDouble()
	{
		try
		{
			double eingabe = scanner.nextDouble();
			return eingabe;
		}
		catch(InputMismatchException e)
		{
			System.out.println("Fehlerhafte Eingabe!");
			return einlesenDouble();
		}
	}
	public void close()
	{
		scanner.close();
	}
}
