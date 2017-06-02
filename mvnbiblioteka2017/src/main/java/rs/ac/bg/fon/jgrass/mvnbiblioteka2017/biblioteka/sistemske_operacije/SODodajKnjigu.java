package rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.sistemske_operacije;

import java.util.LinkedList; 

import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.Knjiga;

public class SODodajKnjigu {
	
	public static void izvrsi (Knjiga k, LinkedList<Knjiga> knjige) {
		if (k == null)
			throw new RuntimeException("Null knjiga");
		
		knjige.add(k);
	}

}
