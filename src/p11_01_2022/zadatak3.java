package p11_01_2022;

public class zadatak3 {

	public static void main(String[] args) {
		
		FacebookPost p1 = new FacebookPost();
		
		p1.imeIPrezime = "Aleksandar Vujicic";
		p1.imeIPrezime2 = "Forest Gamp";
		p1.brojDeljenja = 2;
		p1.brojLajkova = 14;
		p1.tekstObjave = "Run Forest, run.";
		
FacebookPost p2 = new FacebookPost();
		
		p2.imeIPrezime = "Godfather";
		p2.imeIPrezime2 = "Aleksandar Vujicic";
		p2.brojDeljenja = 23;
		p2.brojLajkova = 56;
		p2.tekstObjave = "l'll give you an offer you can't refuse.";
		
		p2.Dislike();
		p2.Share();
		p2.Print();
		
		System.out.println("");
		
		p1.Like();
		p1.Share();
		p1.Print();

	}

}
