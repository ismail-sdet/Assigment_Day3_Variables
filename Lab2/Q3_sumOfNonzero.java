package Labs.Lab2;

import java.util.Scanner;

public class Q3_sumOfNonzero {

	public static void main(String[] args) {
		
//		Write a program that asks the user for a positive nonzero integer value. 
//		The program should use a loop to get the sum of all the integers from 1 up to the number entered. 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter please a positive nonzero integer value: ");
		int inputNum=sc.nextInt();
		int sum = 0;
		for(int i=1; i<=inputNum; i++) {
			sum = sum+i;
		}
		System.out.println("Som of all: "+sum);

	}

}
