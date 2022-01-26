package p_24_01_2022;

import java.util.ArrayList;

public class Korpa {

	ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

	public ArrayList<Ambalaza> getAmbalaze() {
		return ambalaze;
	}

	public void setAmbalaze(ArrayList<Ambalaza> ambalaze) {
		this.ambalaze = ambalaze;
	}

	public void dodajAmbalazu(Ambalaza novaAmbalaza) {
		this.ambalaze.add(novaAmbalaza);
	}
	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < ambalaze.size(); i++) {
			if (this.ambalaze.get(i).getBarkod().equals(barkod)) {
				this.ambalaze.remove(i);
			}
		}
	}
	public double ukupnaSaPopustom(double  popust) {
		double suma = 0;
		for (int i = 0; i < this.ambalaze.size(); i++) {
			suma = suma + (this.ambalaze.get(i).cenaArtikla() - popust );
		}
		return suma;
	}
	public void ukupnaCenaKorpe(SuperKartica superKartica) {
		System.out.println("cena korpe je: " + this.ukupnaSaPopustom(superKartica.getPopust()));
	}
	
}
