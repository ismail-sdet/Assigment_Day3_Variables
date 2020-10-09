package assignments.Assignment_5_forLoop;

import java.util.Scanner;

public class Question_4_product {

	public static void main(String[] args) {
		
//		Write a while loop that lets the user enter a number. 
//		The number should be multiplied by 10, and the result stored 
//		in the variable product. The loop should iterate as long as product 
//		contains a value less than 100.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		while(num*10 <100) {
			System.out.println("product: " +num*10);
			num++;
		}
		

	}

}
