package p11_01_2022;

public class zadatak1 {

	public static void main(String[] args) {
		
		Proizvod p1 = new Proizvod();
		
		p1.naziv = "Laptop";
		p1.tezina = 700;
		p1.cena = 80000;
		
		Proizvod p2 = new Proizvod();
		
		p2.naziv = "Toster";
		p2.tezina = 400;
		p2.cena = 9000;
		
		p1.Stampaj();
		System.out.println("cena sa popustom je: " + p1.CenaSPopustom(20));
		System.out.println("");
		p1.PovecajCenu(6000);
		p1.PovecajCenu(3000);
		System.out.println("cena postarine za ovaj proizvod je: " + p1.racunajPostarinu());
		System.out.println("");
		
		p2.Stampaj();
		System.out.println("cena sa popustom je: " + p2.CenaSPopustom(20));
		System.out.println("");
		p2.PovecajCenu(500);
		p2.PovecajCenu(400);
		System.out.println("cena postarine za ovaj proizvod je: " + p2.racunajPostarinu());

	}

}
