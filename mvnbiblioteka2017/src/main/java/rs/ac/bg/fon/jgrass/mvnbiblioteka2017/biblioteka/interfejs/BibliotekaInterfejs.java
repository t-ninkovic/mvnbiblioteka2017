package rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.interfejs;

import java.util.LinkedList; 

import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.Autor;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2017.biblioteka.Knjiga;

public interface BibliotekaInterfejs {
	
	public void dodajKnjigu(Knjiga k);
	public void obrisiKnjigu(Knjiga k);
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(
			String naslov, Autor autor, long isbn, String izdavac);
	
	public void ucitajKnjige(String filepath) throws Exception;
	public void sacuvajKnjige(String filepath) throws Exception;
	
	
}
