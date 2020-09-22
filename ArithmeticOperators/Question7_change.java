package assigments.ArithmeticOperators;

public class Question7_change {

	public static void main(String[] args) {
		
		int querters , dimes, change, nickles , cost, inputsmoney = 100;
		
		cost     = 30;
		
		change   = (inputsmoney- cost);
		querters = change/25;
		dimes    = (change % 25) /10;
		nickles  = ((change % 25) %10)/5;
		
		System.out.println("Your change is " + querters + " querters " + dimes + " dimes "+ nickles + " nickles");
				
	}

}
