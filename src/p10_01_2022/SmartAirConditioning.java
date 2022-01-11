package p10_01_2022;

public class SmartAirConditioning {

	String brend;
	int temperatura;
	boolean hladnoToplo;
	
	public void Print() {
		
		System.out.println("Brend: " + brend);
		System.out.println("temp: " + temperatura + "c");
		if (hladnoToplo) {
			
			System.out.println("Grejanje je ukljuceno.");
		}
		else {
			System.out.println("Hladjenje je ukljuceno.");
		}
	}
	
}
