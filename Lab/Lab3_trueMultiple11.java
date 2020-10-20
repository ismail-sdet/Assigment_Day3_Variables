package day14_methods_Part2;

public class Lab3_trueMultiple11 {

	public static void main(String[] args) {
		
/*		We'll say a number is special if it is a multiple of 11 or if it is 
		one more than a multiple of 11. Write a method that accepts a number and prints 
		true if the given number is special.
		
		specialEleven(22) -> true
		specialEleven(23) -> true
		specialEleven(24) -> false
*/		
		number11Multiple(32);
		number11Multiple(22);
		number11Multiple(1);
		number11Multiple(45);
	}
	public static void number11Multiple(int n) {
		
		if (n>=11 && (n%11==0||n%11==1)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
