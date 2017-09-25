package gemaelde;

import java.awt.Color;

import gemaelde.Gemaelde;

public class Objekttypen extends Gemaelde{
	
	private int[] koordinatenMittelpunkt;
	private int durchsichtigkeit;
	public int[] getKoordinatenMittelpunkt() {
		return koordinatenMittelpunkt;
	}
	public void setKoordinatenMittelpunkt(int[] koordinatenMittelpunkt) {
		this.koordinatenMittelpunkt = koordinatenMittelpunkt;
	}
	public int getDurchsichtigkeit() {
		return durchsichtigkeit;
	}
	public void setDurchsichtigkeit(int durchsichtigkeit) {
		this.durchsichtigkeit = durchsichtigkeit;
	}
	public Objekttypen(int breite, int hoehe, Color farbe, int[] koordinatenMittelpunkt, int durchsichtigkeit) {
		super(breite, hoehe, farbe);
		this.koordinatenMittelpunkt = koordinatenMittelpunkt;
		this.durchsichtigkeit = durchsichtigkeit;
	}
	
	
	
	
		
	

}
