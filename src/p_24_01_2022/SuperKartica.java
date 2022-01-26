package p_24_01_2022;

public class SuperKartica {

	private String broj;
	private String imeIprezime;
	private double popust;

	public SuperKartica() {
		super();

	}

	public SuperKartica(String broj, String imeIprezime, double popust) {
		super();
		this.broj = broj;
		this.imeIprezime = imeIprezime;
		this.popust = popust;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}
	public void Print() {
		System.out.println("broj kartice: " + this.broj + " ime vlasnika: " + this.imeIprezime);
	}
}
