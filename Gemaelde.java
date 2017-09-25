package gemaelde;

import java.awt.Color;
import java.util.ArrayList;

public class Gemaelde {
	
	ArrayList<Objekttypen> figuren;
	
	private int breite;
	private int hoehe;
	private Color farbe;
	public int getBreite() {
		return breite;
	}
	public void setBreite(int breite) {
		this.breite = breite;
	}
	public int getHoehe() {
		return hoehe;
	}
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	public Color getFarbe() {
		return farbe;
	}
	public void setFarbe(Color farbe) {
		this.farbe = farbe;
	}
	public Gemaelde(int breite, int hoehe, Color farbe) {
		super();
		this.breite = breite;
		this.hoehe = hoehe;
		this.farbe = farbe;
	}
	
	
	public static void main(String[]args){
		
		
		
	}
	


}
