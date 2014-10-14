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
		while(true)
		{
			try
			{
				int eingabe = scanner.nextInt();
				return eingabe;
			}
			catch(InputMismatchException e)
			{
				String errStr = scanner.next();
	            System.out.println( errStr + " ist keine passende Zahl! Wiederholen Sie die Eingabe!");
			}
		}
	}
	public double einlesenDouble()
	{
		while(true)
		{
			try
			{
				double eingabe = scanner.nextDouble();
				return eingabe;
			}
			catch(InputMismatchException e)
			{
				String errStr = scanner.next();
	            System.out.println( errStr + " ist keine passende Zahl! Wiederholen Sie die Eingabe!");
			}
		}
	}
	public void close()
	{
		scanner.close();
	}
}
