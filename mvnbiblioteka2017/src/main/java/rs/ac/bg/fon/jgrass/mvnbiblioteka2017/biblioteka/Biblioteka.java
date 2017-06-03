package rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka;

import java.util.LinkedList;

import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.interfejs.BibliotekaInterfejs;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.sistemske_operacije.SODodajKnjigu;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.sistemske_operacije.SOObrisiKnjigu;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.sistemske_operacije.SOPronadjiKnjigu;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.sistemske_operacije.SOSacuvajKnjige;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.sistemske_operacije.SOUcitajKnjige;

public class Biblioteka implements BibliotekaInterfejs {

	private LinkedList<Knjiga> knjige = 
			new LinkedList<Knjiga>();
	
	public void dodajKnjigu(Knjiga k) {
		SODodajKnjigu.izvrsi(k, knjige);
	}

	public void obrisiKnjigu(Knjiga k) {
		SOObrisiKnjigu.izvrsi(k, knjige);
	}

	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, Autor autor, long isbn, String izdavac) {
		return SOPronadjiKnjigu.izvrsi(naslov, autor, isbn, izdavac, knjige);
	}
	
	public void ucitajKnjige(String filepath) throws Exception {
		knjige = SOUcitajKnjige.izvrsi(filepath);
	}
	
	public void sacuvajKnjige(String filepath) throws Exception {
		SOSacuvajKnjige.izvrsi(filepath, knjige);
	}

}
