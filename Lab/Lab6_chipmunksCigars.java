package day14_methods_Part2;

public class Lab6_chipmunksCigars {

	public static void main(String[] args) {
//		When chipmunks get together for a party, they like to have cigars. 
//		A chipmunk party is successful when the number of cigars is between 40 and 60.
//		Unless it is the weekend, in which case there is no upper bound on the number of cigars.
//		Write a method that accepts number of cigars and a boolean for weekend, 
//		and prints true if the party with the given values is successful, or false otherwise.
		
//		cigarParty(30, false) ->false
//		cigarParty(50, false)->true
//		cigarParty(70, true) ->true

		System.out.println("Is a chipmunk party successful ?");
		
		successfulParty(30, false);
		successfulParty(50, false);
		successfulParty(70, true);
		
	}
	public static void successfulParty(int cigars, boolean weekend) {
		
		if(weekend) {
			if (cigars>=40) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		
		}else {
			if(cigars>=40 && cigars<=60) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}
	}

}
