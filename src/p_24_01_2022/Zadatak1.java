package p_24_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Korpa korpa1 = new Korpa();
		
		SuperKartica superKartica = new SuperKartica("6453243252", "Aleksandar Vujicic", 500);
		
		Ambalaza flasa1 = new StaklenaAmbalaza("3214353253241", "sok jabuka", 500, 600, 50, true, 120);
		Ambalaza flasa2 = new StaklenaAmbalaza("555666777", "pivo", 400, 500, 40, false, 40);	
		Ambalaza tetrapak1 = new Tetrapak("666555444", "mleko", 1000, 1050, true, 90);
		Ambalaza tetrapak2 = new Tetrapak("8787878787", "pavlaka za kuvanje", 250, 300, false, 250);
		
		korpa1.dodajAmbalazu(flasa1);
		korpa1.dodajAmbalazu(flasa2);
		korpa1.dodajAmbalazu(tetrapak1);
		korpa1.dodajAmbalazu(tetrapak2);
		
		korpa1.ukupnaCenaKorpe(superKartica);
	}

}
