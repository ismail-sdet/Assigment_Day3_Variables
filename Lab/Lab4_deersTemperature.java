package day14_methods_Part2;

public class Lab4_deersTemperature {

	public static void main(String[] args) {
		
//		The deers in VA spend most of the day playing. In particular, they play if the temperature is 
//		between 60 and 90. Unless it is summer, then the upper limit is 100 instead of 90.
//		Write a method that accepts temperature and a boolean isSummer, 
//		prints true if the deers play and false otherwise.
		
//		deerPlay(70, false); - > true
//		deerPlay(95, false); - > false
//		deerPlay(95, true); - > true
		
		
		temperature(70, false);
		temperature(95, false);
		temperature(95, true);

	}
	public static void temperature(double temp, boolean isSummer) {
		if(isSummer) {								// when I write here just isSummer, it means 'true'
			if (temp>=60 && temp<=100) {
				System.out.println("Deers play.");
			}else {
				System.out.println("Deers DON'T play");
			}
		
		}else {
			if(temp>=60 && temp<=90) {
				System.out.println("Deers play.");
			}else {
				System.out.println("Deers DON'T play");
			}
		}
	}

}
