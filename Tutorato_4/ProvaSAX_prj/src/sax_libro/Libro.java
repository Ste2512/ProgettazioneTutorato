package sax_libro;
/*
 * Employee.java
 * è la classe che viene instanziata per l'incapsulamento delle 
 * informazioni (name, age, id e type) relative ad un impiegato. 
 * 
 * E' definita in modo tale da avere degli attributi che rispettino 
 * la costruzione del file XML. 
 */

import java.util.ArrayList;
import java.util.List;

public class Libro {

	private String Titolo;
	private String Editore;
	private String Autore;
	private String Prefazione;
	private String AutorePrefazione;
	private ArrayList<String> indice;
	private ArrayList<String> capitoli;
	
	public Libro() {	
		indice=new ArrayList<String>();
		capitoli=new ArrayList<String>();
	}

	public Libro(String titolo, String editore, String autore, String prefazione, String autorePrefazione, ArrayList<String> indice, ArrayList<String> capitoli) 
	{
		this.Titolo = titolo;
		this.Editore=editore;
		this.Autore=autore;
		this.Prefazione=prefazione;
		this.AutorePrefazione=autorePrefazione;
		this.indice=indice;
		this.capitoli=capitoli;
	}




	public String toString() 
	{
		String s = "Book Details - ";
		return (s + 
				"Name:" + getTitolo() + ", " +
				"Editore:" + getEditore() + ", " + 
				"Autore:" + getAutore() + ", " +
				"Prefazione:" + getPrefazione() + "." +
				"Autore prefazione:" + getAutorePrefazione() + "." +
				"indice:" + getIndice() + "." +
				"Capitoli:" + getCapitoli() + ".");
	}

	private String getCapitoli() {
		return this.capitoli.toString();
	}

	private String getIndice() {
		return this.indice.toString();
	}

	private String getAutorePrefazione() {
		return this.AutorePrefazione;
	}

	private String getPrefazione() {
		return this.Prefazione;
	}

	private String getAutore() {
		return this.Autore;
	}

	private String getEditore() {
		return this.Editore;
	}


	public void setTitolo(String titolo) {
		Titolo = titolo;
	}

	public void setEditore(String editore) {
		Editore = editore;
	}

	public void setAutore(String autore) {
		Autore = autore;
	}

	public void setPrefazione(String prefazione) {
		Prefazione = prefazione;
	}

	public void setAutorePrefazione(String autorePrefazione) {
		AutorePrefazione = autorePrefazione;
	}

	public void setIndice(ArrayList<String> indice) {
		this.indice = indice;
	}

	public void setCapitoli(ArrayList<String> capitoli) {
		this.capitoli = capitoli;
	}

	public String getTitolo() {
		return Titolo;
	}

	public void addIndice(String indice) {
		this.indice.add(indice);
	}

	public void addCapitolo(String capitolo) {
		this.capitoli.add(capitolo);
	}
}
