package p17_01_2022;

public class Racun {

	private String brRacuna;
	private String imeIprezime;
	private double stanje;

	public Racun(String brRacuna, String imeIprezime, double stanje) {
		this.brRacuna = brRacuna;
		this.imeIprezime = imeIprezime;
		this.stanje = stanje;
	}

	public Racun() {

	}

	public String getBrRacuna() {
		return brRacuna;
	}

	public void setBrRacuna(String brRacuna) {
		this.brRacuna = brRacuna;
	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public double getStanje() {
		return stanje;
	}

	public void smanjiStanje(double stanje) {
		if (this.stanje - stanje > 0) {
			this.stanje = this.stanje - stanje;
		} else {
			System.out.println("nemate dovoljno sredstava na racunu.");
		}
	}

	public void Print() {
		System.out.println(this.imeIprezime + " - " + this.brRacuna);
		System.out.println("Stanje na racunu je: " + this.stanje + " rsd");
	}
	public void povecajStanje(double stanje) {
		this.stanje = this.stanje + stanje;
	}
}
