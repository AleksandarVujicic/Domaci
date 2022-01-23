package p_21_01_2022;

public class Sektor {

	protected String naziv;
	protected double plata;
	
	
	
	public Sektor() {
		super();
	}

	public Sektor(String naziv, int plata) {
		super();
		this.naziv = naziv;
		this.plata = plata;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(int plata) {
		this.plata = plata;
	}

}
