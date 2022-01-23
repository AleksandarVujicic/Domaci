package p_21_01_2022;

import java.util.ArrayList;

public abstract class Radnik {
	
	

	public Radnik() {
		super();
		
		
	}

	public Radnik(String imeIprezime, ArrayList<Sektor> sektorRada) {
		super();
		this.imeIprezime = imeIprezime;
		this.sektorRada = sektorRada;
	}

	protected String imeIprezime;
	ArrayList<Sektor> sektorRada = new ArrayList<Sektor>();

	public abstract double Plata();

	public void ideUSektor(Sektor sektor) {
		sektorRada.add(sektor);

	}
}
