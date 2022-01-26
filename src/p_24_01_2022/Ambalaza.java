package p_24_01_2022;

public abstract class Ambalaza {

	protected String barkod;
	protected String naziv;
	protected double tezinaNeto;
	protected double tezinaBruto;

	public Ambalaza() {
		super();
	}

	public Ambalaza(String barkod, String naziv, double tezinaNeto, double tezinaBruto) {
		super();
		this.barkod = barkod;
		this.naziv = naziv;
		this.tezinaNeto = tezinaNeto;
		this.tezinaBruto = tezinaBruto;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getTezinaNeto() {
		return tezinaNeto;
	}

	public void setTezinaNeto(int tezinaNeto) {
		this.tezinaNeto = tezinaNeto;
	}

	public double getTezinaBruto() {
		return tezinaBruto;
	}

	public void setTezinaBruto(int tezinaBruto) {
		this.tezinaBruto = tezinaBruto;
	}

	public double tezinaAmbalaze() {
		return this.tezinaBruto - this.tezinaNeto;
	}
	public abstract double cenaArtikla();
	
	public abstract void Print();
}
