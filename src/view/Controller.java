package view;

import java.util.Map;
import java.awt.*;

import javax.swing.*;

import logikabteilung.Nutzerverwaltung;
import logikabteilung.Artikelverwaltung;
import logikabteilung.Benutzer;


public class Controller
{
	private Nutzerverwaltung nutzerLogik = new Nutzerverwaltung();
	private Artikelverwaltung artikelLogik = new Artikelverwaltung();
	
	private Eingabe input = new Eingabe();
	private Benutzer aktuellerNutzer;
	
	private HauptmenueAnsicht hauptmenue = new HauptmenueAnsicht();
	private LogInAnsicht login = new LogInAnsicht();
	private RegistrationAnsicht registration = new RegistrationAnsicht();
	private EinkaufAnsicht einkauf = new EinkaufAnsicht();
	private WarenkorbAnsicht warenkorb = new WarenkorbAnsicht();
	private NutzerAnsicht profil = new NutzerAnsicht();
	private ArtikelCRUD artikel = new ArtikelCRUD();
	
	public void start()
	{
		hauptmenue.auswahlmenue();
	}
}
	
