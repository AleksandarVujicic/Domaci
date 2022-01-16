package p14_01_2022;

public class Knjiga {

	private String isbn;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;
	
	public Knjiga() {
		
	}
	public Knjiga(String isbn, String naziv, int godinaIzdanja, Autor autor) {
		
		this.isbn=isbn;
		this.naziv=naziv;
		this.godinaIzdanja=godinaIzdanja;
		this.autor=autor;
	}
	
	public String getISBN() {
		return this.isbn;
	}
	public void setISBN(String isbn) {
		this.isbn=isbn;
	}
	public String getNaziv() {
		return this.naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv=naziv;
	}
	public int getGodinaIzdanja() {
		return this.godinaIzdanja;
	}
	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja=godinaIzdanja;
	}
	public Autor getAutor() {
		return this.autor;
	}
	public void Print () {
		System.out.println(getISBN());
		System.out.println(getNaziv() + " - " + getGodinaIzdanja() + ".");
		getAutor().Print();
	}
}
