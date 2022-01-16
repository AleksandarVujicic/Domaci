package p14_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor("Yuval Noah", "Harari");
		Autor autor2 = new Autor("Charles", "Dickens");
		
		Knjiga knjiga1 = new Knjiga("135-437-332", "Homo Deus", 2018, autor1);
		Knjiga knjiga2 = new Knjiga("653-234-645", "Sapiens", 2017, autor1);
		Knjiga knjiga3 = new Knjiga("853-532-980", "Oliver Twist", 1838, autor2);
		
		knjiga1.Print();
		knjiga2.Print();
		knjiga3.Print();
	}

}
