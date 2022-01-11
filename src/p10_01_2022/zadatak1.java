package p10_01_2022;

public class zadatak1 {

	public static void main(String[] args) {
		
		Proizvod p1 = new Proizvod();
		
		p1.naziv = "Hleb";
		p1.cena = 40;
		p1.tezina = 0.5;
		
		Proizvod p2 = new Proizvod();
		
		p2.naziv = "Mleko";
		p2.cena = 80;
		p2.tezina = 0.7;
		
		p1.Print();
		System.out.println("");
		p2.Print();
		
	}

}
