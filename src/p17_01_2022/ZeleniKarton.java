package p17_01_2022;

public class ZeleniKarton {

	private String ime;
	private int indeks;
	private String predmet;
	private String imeProfesora;
	private int ocena;

	public ZeleniKarton() {
		super();

	}

	public ZeleniKarton(String ime, int indeks, String predmet, String imeProfesora, int ocena) {
		super();
		this.ime = ime;
		this.indeks = indeks;
		this.predmet = predmet;
		this.imeProfesora = imeProfesora;
		this.ocena = ocena;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getIndeks() {
		return indeks;
	}

	public void setIndeks(int indeks) {
		this.indeks = indeks;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public String getImeProfesora() {
		return imeProfesora;
	}

	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public boolean polozeniPredmeti() {
		if (this.ocena < 5) {
			return true;
		}
		return false;
	}
	public void Print () {
		System.out.println(this.predmet + " - " + this.ocena);
		System.out.println("Student: " + this.ime + ", " + this.indeks);
		System.out.println("Profesor: " + this.imeProfesora);
	}

}
