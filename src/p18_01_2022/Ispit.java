package p18_01_2022;

public class Ispit {

	private String predmet;
	private double ocena;
	private String imeProfesora;

	public Ispit() {
	}

	public Ispit(String predmet, double ocena, String imeProfesora) {

		this.predmet = predmet;
		this.ocena = ocena;
		this.imeProfesora = imeProfesora;
	}
	
	
	
	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public double getOcena() {
		return ocena;
	}

	public void setOcena(double ocena) {
		this.ocena = ocena;
	}

	public String getImeProfesora() {
		return imeProfesora;
	}

	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}

	public boolean polozenIspit() {
		if (this.ocena > 5) {
			return true;
		}
			return false;
	}
	public void Print () {
		System.out.println(this.predmet + " - " + this.imeProfesora + " - " + this.ocena);
	}
}
