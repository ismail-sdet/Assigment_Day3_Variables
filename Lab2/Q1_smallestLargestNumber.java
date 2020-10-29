package Labs.Lab2;

import java.util.Scanner;

public class Q1_smallestLargestNumber {

	public static void main(String[] args) {

//		Write a program with a loop that lets the user enter a series of integer numbers. 
//		After all the numbers have been entered, the program should display the largest 
//		and smallest numbers entered.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter your first number: ");
		int num1 = sc.nextInt(); 
		System.out.print("Enter your next number: ");
		int num2 = sc.nextInt(); 		
		
		int largestNumber=0, smallestNumber=0;
		
		if (num1>num2) {
			largestNumber= num1;
			smallestNumber= num2;
		}else if (num2>num1){
			largestNumber= num2;
			smallestNumber= num1;
			
		}
		System.out.print("Do you want to enter another number? 0-No, 1-Yes : ");			
		int x = sc.nextInt(); 
		
		while(x==1) {		
				System.out.print("Enter your next number: ");
				int numx = sc.nextInt(); 
				if( numx>largestNumber) {
					largestNumber=numx;
					
				}else if(numx<smallestNumber) {
					smallestNumber=numx;
					
				}
				System.out.print("Do you want to enter another number? 0-No, 1-Yes : ");			
				x = sc.nextInt();
			
			}
		System.out.println("Smallest Number: "+smallestNumber);
		System.out.println("Largest Number: "+largestNumber);
		
		
		
			
		
		
	}

}
