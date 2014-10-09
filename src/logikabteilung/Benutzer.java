package logikabteilung;

public class Benutzer
{
	private Warenkorb warenkorb;
	private int id;
	private String name;
	private String email;
	private String geburtstag;
	private String strasse;
	private String hausnummer;
	private String stadt;
	private String plz;
	private String passwort;
	
	/* Getter */
	public Warenkorb getWarenkorb()
	{
		return warenkorb;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public String getGeburtstag()
	{
		return geburtstag;
	}
	public String getStrasse()
	{
		return strasse;
	}
	public String getHausnummer()
	{
		return hausnummer;
	}
	public String getStadt()
	{
		return stadt;
	}
	public String getPlz()
	{
		return plz;
	}
	public String getPasswort()
	{
		return passwort;
	}
	/* Setter */
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setGeburtstag(String geburtstag)
	{
		this.geburtstag = geburtstag;
	}
	public void setStrasse(String strasse)
	{
		this.strasse = strasse;
	}
	public void setHausnummer(String hausnummer)
	{
		this.hausnummer = hausnummer;
	}
	public void setStadt(String stadt)
	{
		this.stadt = stadt;
	}
	public void setPlz(String plz)
	{
		this.plz = plz;
	}
	public void setPasswort(String passwort)
	{
		this.passwort = passwort;
	}
	// Artikel in Warenkorb
}
