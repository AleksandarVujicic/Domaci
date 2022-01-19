package p17_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Racun primalac = new Racun("123-456-789", "Aleksandar Vujicic", 15000);
		Racun posiljalac = new Racun("723-786-345", "Kristina Krstic", 2500);
		
		Transakcija transakcija = new Transakcija("54214", posiljalac, primalac);
		
		transakcija.izvrsiTransakciju(2);
		transakcija.Print();
	}

}
