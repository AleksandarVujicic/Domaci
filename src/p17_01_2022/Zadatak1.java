package p17_01_2022;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		
		ArrayList<ZeleniKarton> polaganje = new ArrayList<ZeleniKarton>();
		
		ZeleniKarton polaganje1 = new ZeleniKarton("Aleksandar Vujicic", 120105, "Metodologija", "Mira Jovanovic", 10);
		ZeleniKarton polaganje2 = new ZeleniKarton("Aleksandar Vujicic", 120105, "Istorija knjizevnosti", "Jelica Veljovic", 7);
		ZeleniKarton polaganje3 = new ZeleniKarton("Aleksandar Vujicic", 120105, "Sefardi", "Anica Milovanovic", 9);
		ZeleniKarton polaganje4 = new ZeleniKarton("Aleksandar Vujicic", 120105, "Semantika", "Dalibor Rakic", 5);
		ZeleniKarton polaganje5 = new ZeleniKarton("Aleksandar Vujicic", 120105, "Fonologija", "Jelena Nikolic", 8);
		ZeleniKarton polaganje6 = new ZeleniKarton("Aleksandar Vujicic", 120105, "Integrisane 3", "Ivana Mirkovic", 6);
		ZeleniKarton polaganje7 = new ZeleniKarton("Aleksandar Vujicic", 120105, "Prevodi", "Nenad Zivkovic", 7);
		ZeleniKarton polaganje8 = new ZeleniKarton("Aleksandar Vujicic", 120105, "Pedagogija", "Rade Dragomirovic", 9);
		ZeleniKarton polaganje9 = new ZeleniKarton("Aleksandar Vujicic", 120105, "Leksikologija", "Andjelka Pejovic", 10);
		
		polaganje1.Print();
		polaganje2.Print();
		polaganje3.Print();
		polaganje4.Print();
		polaganje5.Print();
		polaganje6.Print();
		polaganje7.Print();
		polaganje8.Print();
		polaganje9.Print();
}

}
