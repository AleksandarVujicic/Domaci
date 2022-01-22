package p20_01_2022;

public class Trener extends Osoba {

	private int godineIskustva;
	private String tip;

	public Trener() {
		super();
	}

	public Trener(String imeIprezime, String jmbg, int godinaRodjenja, int godineIskustva, String tip) {
		super(imeIprezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tip = tip;
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public void Print() {
	super.Print();
	System.out.println("godine iskustva: " + this.godineIskustva + " pozicija: " + this.tip + " trener");
	System.out.println("");
	}
}
