package p13_01_2022;

public class FacebookPost {

	private String imeKorisnika1;
	private String imeKorisnika2;
	private String tekstObjave;
	private int brojLajkova;
	private int brojDeljenja;
	
	public FacebookPost() {}
	public FacebookPost(String imeKorisnika1, String imeKorisnika2, String tekstObjave) {
		this.imeKorisnika1 = imeKorisnika1;
		this.imeKorisnika2=imeKorisnika2;
		this.tekstObjave=tekstObjave;
	}
	
	public String getImeKorisnika1 () {
		return this.imeKorisnika1;
	}
	public void setImeKorisnika (String novoImeKorisnika1) {
		this.imeKorisnika1=novoImeKorisnika1;
	}
	public String getImeKorisnika2() {
		return this.imeKorisnika2;
	}
	public void setImeKorisnika2(String novoImeKorisnika2) {
		this.imeKorisnika2=novoImeKorisnika2;
	}
	public String getTekstObjave () {
		return this.tekstObjave;
	}
	public void setTekstObjave(String tekstObjave) {
		this.tekstObjave=tekstObjave;
	}
	public int getBrojLajkova() {
		return this.brojLajkova;
	}
	public int getBrojDeljenja () {
		return this.brojDeljenja;
	}
	public int Lajk() {
		this.brojLajkova++;
		return this.brojLajkova;
	}
	public int Disajk() {
		this.brojLajkova--;
		return this.brojLajkova;
}
	public int Share () {
		this.brojDeljenja++;
		return this.brojDeljenja;
	}
	public void Print () {
		System.out.println(getImeKorisnika1() + " >>>> " + getImeKorisnika2());
		System.out.println(getTekstObjave());
		System.out.println("Likes " + getBrojLajkova() + " | Shares " + getBrojDeljenja());
	}
}