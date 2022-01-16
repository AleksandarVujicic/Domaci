package p13_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		FacebookPost post1 = new FacebookPost("Aleksandar Vujicic", "Kristina Vujicic", "Hello World");
		FacebookPost post2 = new FacebookPost("Nikola Nikolic", "Pera Peric", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Elit ut aliquam purus sit amet luctus venenatis.");
		
		post1.Share();
		post1.Lajk();
		post1.Print();
		System.out.println("");
		post2.Lajk();
		post2.Print();
		

	}

}
