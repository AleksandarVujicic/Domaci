package p11_01_2022;

public class FacebookPost {

	String imeIPrezime;
	String imeIPrezime2;
	String tekstObjave;
	int brojLajkova;
	int brojDeljenja;

	public int Like() {

		int lajk = brojLajkova++;
		return lajk;
	}

	public int Dislike() {

		if (brojLajkova > 0) {
			int dislajk = brojLajkova--;
			return dislajk;
		} else {
			return 0;
		}
	}
	public int Share() {
		
		int share = brojDeljenja++;
		return share;
	}
	public void Print() {
		
		System.out.println(imeIPrezime + " >>>> " + imeIPrezime2);
		System.out.println(tekstObjave);
		System.out.println("Likes " + brojLajkova + " | " + "Share " + brojDeljenja);
	}
}
