package p18_01_2022;

import java.util.ArrayList;

public class Student {

	private String index;
	private String ime;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();
	
	public Student(String index, String ime, String tipStudija) {
		super();
		this.index = index;
		this.ime = ime;
		this.tipStudija = tipStudija;
		
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}
	
	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
}
	public double racunajProsek() {
		
		double suma = 0;
		double prosek = 0;
		int brojPolozenihIspita = 0;
		
		for (int i=0; i < ispiti.size(); i++) {
			
			if (this.ispiti.get(i).polozenIspit() == true) {
				
				suma = suma + ispiti.get(i).getOcena();
				brojPolozenihIspita++;
			}
				
			}
			prosek = suma / brojPolozenihIspita;
			return prosek;
		}
	public void Print () {
		
		System.out.println(this.index + " " + this.ime + " " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < ispiti.size(); i++) {
		System.out.println(ispiti.get(i).getPredmet() + " " + ispiti.get(i).getImeProfesora() + " " + ispiti.get(i).getOcena());
		}
		System.out.println("Prosecna ocena: " + this.racunajProsek());
	}

}
	
	
	

