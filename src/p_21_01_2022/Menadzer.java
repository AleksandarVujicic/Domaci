package p_21_01_2022;

import java.util.ArrayList;

public class Menadzer extends Radnik {

	public double plata = 0;

	public Menadzer() {
		super();
	}

	public Menadzer(String imeIprezime, ArrayList<Sektor> sektorRada) {
		super(imeIprezime, sektorRada);
		
	}

	@Override
	public double Plata() {
		for (int i = 0; i < sektorRada.size(); i++) {
			plata = plata + sektorRada.get(i).getPlata();
		}
		return plata;
	}

}
