package p20_01_2022;

public class Igrac extends Osoba {

	private int broj;
	private String pozicija;
	private boolean kapiten;

	public Igrac() {
		super();
	}

	public Igrac(String imeIprezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
		super(imeIprezime, jmbg, godinaRodjenja);
		this.broj = broj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	public void Print() {
		super.Print();
		System.out.print("broj na dresu: " + this.broj + ", pozicija: " + this.pozicija + ", kapiten: ");
		if (isKapiten()) {
			System.out.println("jeste");
		}
		else {
			System.out.println("nije");
		}
		System.out.println("");
	}
	
}