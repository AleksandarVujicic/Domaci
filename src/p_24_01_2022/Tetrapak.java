package p_24_01_2022;

public class Tetrapak extends Ambalaza {

	private boolean mozeSeReciklirati;
	private double OsnovnaCena;

	public Tetrapak() {
		super();

	}

	public Tetrapak(String barkod, String naziv, double tezinaNeto, double tezinaBruto, boolean mozeSeReciklirati,
			double osnovnaCena) {
		super(barkod, naziv, tezinaNeto, tezinaBruto);
		this.mozeSeReciklirati = mozeSeReciklirati;
		this.OsnovnaCena = osnovnaCena;
	}

	public boolean isMozeSeReciklirati() {
		return mozeSeReciklirati;
	}

	public void setMozeSeReciklirati(boolean mozeSeReciklirati) {
		this.mozeSeReciklirati = mozeSeReciklirati;
	}

	public double getOsnovnaCena() {
		return OsnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		OsnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (this.mozeSeReciklirati) {
			return this.tezinaAmbalaze() * 1.5 + this.OsnovnaCena;
		} else {
			return this.OsnovnaCena;
		}
	}

	@Override
	public void Print() {
		if (this.mozeSeReciklirati) {
			System.out.println("ambalaza se moze reciklirati.");

		} else {
			System.out.println("ambalaza se ne moze reciklirati.");
		}
		System.out.println("cena je: " + this.OsnovnaCena);
	}

}
