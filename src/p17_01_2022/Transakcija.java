package p17_01_2022;

public class Transakcija {
	private String idTransakcija;
	private Racun posiljalac;
	private Racun primalac;

	public Transakcija() {
	}

	public Transakcija(String idTransakcija, Racun posiljalac, Racun primalac) {
		this.idTransakcija = idTransakcija;
		this.posiljalac = posiljalac;
		this.primalac = primalac;
	}

	public String getIdTransakcija() {
		return idTransakcija;
	}

	public void setIdTransakcija(String idTransakcija) {
		this.idTransakcija = idTransakcija;
	}

	public Racun getPosiljalac() {
		return posiljalac;
	}

	public void setPosiljalac(Racun posiljalac) {
		this.posiljalac = posiljalac;
	}

	public Racun getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}
	private double Provizija(double visinaTransakcije) {
		if (visinaTransakcije < 4500) {
			return 45;
		}
		else {
			return visinaTransakcije/100;
		}
		
	}
	public void izvrsiTransakciju(double prenesenaSredstva) {
		this.posiljalac.smanjiStanje(prenesenaSredstva + Provizija(prenesenaSredstva));
		this.primalac.povecajStanje(prenesenaSredstva);
	}
	public void Print() {
		System.out.println("ID transakcije: " + this.idTransakcija);
		System.out.println("Racun sa: " + this.posiljalac.getImeIprezime() + " - " + this.posiljalac.getBrRacuna() + " - " + this.posiljalac.getStanje() + "rsd");
		System.out.println("Racun na: " + this.primalac.getImeIprezime() + " - " + this.primalac.getBrRacuna() + " - " + this.primalac.getStanje() + "rsd");
	}
}
