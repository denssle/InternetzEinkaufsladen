package logikabteilung;

public class Artikel
{
	private int artikelId;
	private double preis;
	private String bezeichnung;
	private String kategorie;
	
	/* getter */
	public int getArtikelId()
	{
		return artikelId;
	}
	public double getPreis()
	{
		return preis;
	}
	public String getBezeichnung()
	{
		return bezeichnung;
	}
	
	/* setter */
	public void setArtikelId(int artikelId)
	{
		this.artikelId = artikelId;
	}
	public void setPreis(double preis)
	{
		this.preis = preis;
	}
	public void setBezeichnung(String bezeichnung)
	{
		this.bezeichnung = bezeichnung;
	}
}
