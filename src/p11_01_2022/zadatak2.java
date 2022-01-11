package p11_01_2022;

public class zadatak2 {

	public static void main(String[] args) {
		
		SmartAirConditioning s1 = new SmartAirConditioning();
		
		s1.brend = "Vivax";
		s1.mod = "grejanje";
		s1.potrosnjaGrejanje = 1;
		s1.potrosnjaHladjenje = 2;
		s1.temperatura = 22;
		
		s1.Print();
		s1.PotrosnjaCena();
		System.out.println("Potrosnja elektricne energije za ovaj mesec je: " + s1.PotrosnjaKW() + "KW");
		
	}

}
