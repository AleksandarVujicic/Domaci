package p11_01_2022;

public class Proizvod {

	String naziv;
	int cena;
	double tezina;

	public void Stampaj() {

		System.out.println(naziv + ", " + cena + ", " + tezina + "gr");

	}

	public void PovecajCenu(int povecajCenu) {

		cena = cena + povecajCenu;
	}

	public int CenaSPopustom(int popust) {

		int novaCena = (cena / 100) * (100 - popust);
		return novaCena;
	}

	public int racunajPostarinu() {

		int postarina = 0;

		if (tezina < 100) {

			postarina = 200;
			return postarina;
		} else if (tezina < 100 && tezina < 500) {

			postarina = 400;
			return postarina;
		}
		else {
			
			postarina = 1000;
			return postarina;
		}
	}
}
