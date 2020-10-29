package Labs.Lab2;

import java.util.Scanner;

public class Q4_percentageOfClass {

	public static void main(String[] args) {
		
//		Write a program that asks user for the number of males and the number of females 
//		registered in a class. The program should display the percentage of males and females 
//		in the class.
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Enter please the number of males:");
		double males = sc.nextInt();
		System.out.print("Enter please the number of females:");
		double females= sc.nextInt();
		
		double percentOfMales   = males/(males+females);
		double percentOfFemales = females/(males+females);
		
		System.out.println("Percent of males: " +percentOfMales);
		System.out.println("Percent of females: "+percentOfFemales);
		

	}

}
