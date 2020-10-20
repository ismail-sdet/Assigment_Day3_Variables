package day14_methods_Part2;

public class Lab2_greatNumber6 {

	public static void main(String[] args) {
		
/*		The number 6 is a truly great number. Write a method that accepts num1 and num2, 
		prints true if either one is 6. Or if their sum or difference is 6.
		love6(6, 4) -> true
		love6(4, 5) -> false
		love6(1, 5) -> true
		love6(12, 6); ->true
*/
		
		greatNumber(3, 9);

	}
	public static void greatNumber(int num1, int num2) {
		
		if (num1 == 6 || num2 == 6 || num1-num2==6 || num2-num1==6 ||num1+num2==6) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	
}
