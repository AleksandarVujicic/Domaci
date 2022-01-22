package p20_01_2022;

public class Osoba {

	protected String imeIprezime;
	protected String jmbg;
	protected int godinaRodjenja;

	public Osoba() {
		super();
	}

	public Osoba(String imeIprezime, String jmbg, int godinaRodjenja) {
		super();
		this.imeIprezime = imeIprezime;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}
	public void Print() {
		System.out.println("ime i prezime: " + this.imeIprezime + ", " + this.jmbg + ", " + this.godinaRodjenja);
	
	}
}
