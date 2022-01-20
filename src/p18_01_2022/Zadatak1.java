package p18_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Student student1 = new Student("43431", "Aleksandar Vujicic", "Hispanistika");
		
		Ispit ispit1 = new Ispit ("Metodologija", 7, "Mira Jovanovic");
		Ispit ispit2 = new Ispit ("Knjizevnost 1", 10, "Jelica Veljovic");
		Ispit ispit3 = new Ispit ("Semantika", 8, "Dalibor Petrovic");
		Ispit ispit4 = new Ispit ("Integrisane 2", 9, "Andjelka Pejovic");
		Ispit ispit5 = new Ispit ("Prevodi", 8, "Ivana Nikolic");
		Ispit ispit6 = new Ispit ("Sefardi", 10 , "Masa Petrovic");
		Ispit ispit7 = new Ispit ("Govorni", 6, "Isabel Lopez");

	student1.dodajIspit(ispit1);
	student1.dodajIspit(ispit2);
	student1.dodajIspit(ispit3);
	student1.dodajIspit(ispit4);
	student1.dodajIspit(ispit5);
	student1.dodajIspit(ispit6);
	student1.dodajIspit(ispit7);
	
	student1.Print();
		

	}

}
