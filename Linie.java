package gemaelde;

import java.awt.Color;
import java.awt.Point;

import gemaelde.LinieAllgemein;

public class Linie extends LinieAllgemein{

	public Linie(int breite, int hoehe, Color farbe, int[] koordinatenMittelpunkt, int durchsichtigkeit, Point anfang,
			Point ende, int laenge, int dicke) {
		super(breite, hoehe, farbe, koordinatenMittelpunkt, durchsichtigkeit, anfang, ende, laenge, dicke);
		
	}

}
