package logikabteilung;

import java.io.Serializable;

public class Artikel implements Serializable
{
	private int artikelId;
	private String name;
	private double preis;
	private String beschreibung;
	private String kategorie;
	public int getArtikelId() {
		return artikelId;
	}
	public String getName() {
		return name;
	}
	public double getPreis() {
		return preis;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public String getKategorie() {
		return kategorie;
	}
	public void setArtikelId(int artikelId) {
		this.artikelId = artikelId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}

}
