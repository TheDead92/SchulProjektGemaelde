package gemaelde;

import java.awt.Color;
import java.awt.Point;

import gemaelde.Objekttypen;

public class LinieAllgemein extends Objekttypen{

	private Point anfang;
	private Point ende;
	private int laenge;
	private int dicke;
	
	public Point getAnfang() {
		return anfang;
	}
	public void setAnfang(Point anfang) {
		this.anfang = anfang;
	}
	public Point getEnde() {
		return ende;
	}
	public void setEnde(Point ende) {
		this.ende = ende;
	}
	public int getLaenge() {
		return laenge;
	}
	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}
	public int getDicke() {
		return dicke;
	}
	public void setDicke(int dicke) {
		this.dicke = dicke;
	}
	public LinieAllgemein(int breite, int hoehe, Color farbe, int[] koordinatenMittelpunkt, int durchsichtigkeit,
			Point anfang, Point ende, int laenge, int dicke) {
		super(breite, hoehe, farbe, koordinatenMittelpunkt, durchsichtigkeit);
		this.anfang = anfang;
		this.ende = ende;
		this.laenge = laenge;
		this.dicke = dicke;
	}
	
	
	
}
