package _1_definingClasses_1;

public class GSMTest {

	public static void main(String[] args) {
		GSM[] gsmData = new GSM[5];
		
		gsmData[0] = new GSM("Galaxy S4", "Samsung");
		gsmData[1] = new GSM("One X", "HTC");
		gsmData[2] = new GSM("Defy", "Motorola");
		
		System.out.println(gsmData[0].toString());
		System.out.println(gsmData[1].toString());
		System.out.println(gsmData[2].toString());
		
		System.out.println(GSM.getIphone4S());
	}
	
}
