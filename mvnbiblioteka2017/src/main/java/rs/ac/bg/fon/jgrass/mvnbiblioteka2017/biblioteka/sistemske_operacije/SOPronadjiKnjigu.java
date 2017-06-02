package rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.sistemske_operacije;

import java.util.LinkedList; 

import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.Autor;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.Knjiga;

public class SOPronadjiKnjigu {
	
	public static LinkedList<Knjiga> izvrsi (String naslov, Autor autor, 
			long isbn, String izdavac, LinkedList<Knjiga> knjige) {
		if (autor == null || isbn == 0 ||
				naslov == null || izdavac == null)
			throw new RuntimeException("Morate uneti sve");
		
		LinkedList<Knjiga> rezultat = 
				new LinkedList<Knjiga>();
		
		for (int i=0;i<knjige.size();i++)
			if (knjige.get(i).getNaslov().contains(naslov))
				rezultat.add(knjige.get(i));
		//javan komentar
		return rezultat;
	}

}
