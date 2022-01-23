package p_21_01_2022;

import java.util.ArrayList;

public class Magacioner extends Radnik {

	private double prosecnaPlata = 0;
	private double suma = 0;
	public double plata = 0;

	public Magacioner() {
		super();

	}

	public Magacioner(String imeIprezime, ArrayList<Sektor> sektorRada) {
		super(imeIprezime, sektorRada);

	}

	private double ProsecnaPlata() {

		for (int i = 0; i < sektorRada.size(); i++) {
			prosecnaPlata = sektorRada.get(i).getPlata() + prosecnaPlata;
		}
		suma = (prosecnaPlata / sektorRada.size()) / 2;

		return suma;
	}

	@Override
	public double Plata() {
		this.suma = ProsecnaPlata() * sektorRada.size();
		return suma;
	}

}
