package p_21_01_2022;

import java.util.ArrayList;

public class zadatak1 {

	public static void main(String[] args) {

		ArrayList<Sektor> magacionerSektor = new ArrayList<Sektor>();
		ArrayList<Sektor> menadzerSektor =  new ArrayList<Sektor>();
		
		Menadzer menadzer1 = new Menadzer("Aleksandar Vujicic", menadzerSektor);
		Menadzer menadzer2 = new Menadzer("Stefan Stefanovic", menadzerSektor);
		
		Magacioner magacioner1 = new Magacioner("Jovan Jovic", magacionerSektor);
		Magacioner magacioner2 = new Magacioner("Pera Peric", magacionerSektor);

		Sektor finansije = new Sektor("finansije", 67000);
		Sektor distribucija = new Sektor("distribucija", 40000);
		Sektor nabavka = new Sektor("nabavka", 50000);
		
		menadzer1.ideUSektor(finansije);
		magacioner1.ideUSektor(nabavka);
		
		System.out.println("Plata menadzera je: " + menadzer1.plata);
		System.out.println("");
		System.out.println("Plata magacionera je: " + magacioner1.plata);
		
	}

}
