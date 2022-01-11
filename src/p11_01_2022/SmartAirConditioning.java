package p11_01_2022;

public class SmartAirConditioning {

	String brend;
	int potrosnjaHladjenje;
	int potrosnjaGrejanje;
	int temperatura;
	String mod;

	public void Print() {

		System.out.println(brend + ", " + mod + ", " + temperatura);
	}

	public int PotrosnjaKW() {

		int potrosnja = 0;

		if (mod.equals("grejanje")) {

			potrosnja = 30 * 15 * potrosnjaGrejanje;

		} else if (mod.equals("hladjenje")) {

			potrosnja = 30 * 15 * potrosnjaHladjenje;

		}
		return potrosnja;
	}
	public void PotrosnjaCena() {
		
		if (PotrosnjaKW() < 350) {
			
			System.out.println("Racun za ovaj mesec je: " + PotrosnjaKW() * 6 + "RSD");
		}
		else {
				int plavaZona = PotrosnjaKW() - 350;
				int racun = 350 * 6 + plavaZona * 9;
				
				System.out.println("Racun za ovaj mesec je: " + racun + "RSD");
			
		}
		}
	}
