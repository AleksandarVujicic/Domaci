package p_24_01_2022;

public class StaklenaAmbalaza extends Ambalaza {

	private double kaucija;
	private boolean placaSeKaucija;
	private double osnovnaCena;

	public StaklenaAmbalaza() {
		super();

	}

	public StaklenaAmbalaza(String barkod, String naziv, double tezinaNeto, double tezinaBruto, double kaucija,
			boolean placaSeKaucija, double osnovnaCena) {
		super(barkod, naziv, tezinaNeto, tezinaBruto);
		this.kaucija = kaucija;
		this.placaSeKaucija = placaSeKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isPlacaSeKaucija() {
		return placaSeKaucija;
	}

	public void setPlacaSeKaucija(boolean placaSeKaucija) {
		this.placaSeKaucija = placaSeKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (this.placaSeKaucija) {
			return this.tezinaAmbalaze() * 1.2 + this.osnovnaCena;
		} else {
			return this.osnovnaCena * 1.2;
		}
	}

	@Override
	public void Print() {
		if (this.placaSeKaucija) {
			System.out.println("cena kaucije je: " + this.kaucija);
		} else {
			System.out.println("ne placa se kaucija.");
		}
		System.out.println("cena je: " + this.osnovnaCena);
	}

}
