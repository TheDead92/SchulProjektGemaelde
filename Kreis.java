package gemaelde;

import java.awt.Color;

import gemaelde.Objekttypen;

public class Kreis extends Objekttypen{
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Kreis(int breite, int hoehe, Color farbe, int[] koordinatenMittelpunkt, int durchsichtigkeit, int radius) {
		super(breite, hoehe, farbe, koordinatenMittelpunkt, durchsichtigkeit);
		this.radius = radius;
	}
	
	

}
