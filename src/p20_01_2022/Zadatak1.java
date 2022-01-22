package p20_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Igrac igrac1 = new Igrac("Aleksandar", "43143141431", 1993, 3, "levi bek", true);
		Igrac igrac2 = new Igrac("Marko", "643522431", 1998, 10, "krilo", false);

		
		Trener trener1 = new Trener("Stefan", "765545425243", 1989, 3, "kondicioni");
		Trener trener2 = new Trener("Petar", "8756435442432", 1976, 20, "glavni");
		
		igrac1.Print();
		igrac2.Print();
		trener1.Print();
		trener2.Print();
		
	}

}
