package assignments.Assignment_5_forLoop;

import java.util.Scanner;

public class Question_4_product {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		while(num*10 <100) {
			System.out.println("product: " +num*10);
			num++;
		}
		

	}

}
