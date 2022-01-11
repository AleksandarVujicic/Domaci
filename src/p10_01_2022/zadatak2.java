package p10_01_2022;

public class zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning s1 = new SmartAirConditioning();

		s1.brend = "Samsung";
		s1.temperatura = 25;
		s1.hladnoToplo = true;

		SmartAirConditioning s2 = new SmartAirConditioning();

		s2.brend = "Vox";
		s2.temperatura = 18;
		s2.hladnoToplo = false;

		s1.Print();
		System.out.println("");
		s2.Print();

	}

}
