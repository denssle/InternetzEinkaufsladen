package logikabteilung;

public class Artikel
{
	private int artikelId;
	private String name;
	private double preis;
	private String beschreibung;
	private String kategorie;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getPreis()
	{
		return preis;
	}
	public void setPreis(double preis)
	{
		this.preis = preis;
	}
	public String getBeschreibung()
	{
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung)
	{
		this.beschreibung = beschreibung;
	}
	public String getKategorie()
	{
		return kategorie;
	}
	public void setKategorie(String kategorie)
	{
		this.kategorie = kategorie;
	}
	public int getArtikelId()
	{
		return artikelId;
	}

	
}
