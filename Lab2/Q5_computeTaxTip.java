package Labs.Lab2;

import java.util.Scanner;

public class Q5_computeTaxTip {

	public static void main(String[] args) {
		
//		Write a program that computes the tax and tip on a restaurant bill. 
//		The program should ask the user to enter the charge for the meal. 
//		The tax should be 6.75 percent of the meal charge. The tip should be 20 percent 
//		of the total after adding tax. Display the meal charge, tax amount, tip amount, 
//		and total bill on the screen.
		
		Scanner sc= new Scanner (System.in);
		
		System.out.print("Enter please the charge for the meal: ");
		double charge = sc.nextDouble();
		
		double tax = charge/6.75;
		double tip = (tax+charge)*0.20;
		double sumCharge= charge+tip+tax;
		
		System.out.println("*************************************");
		System.out.println("Charge of the meal: "+charge);
		System.out.println("Tax amount: "+tax);
		System.out.println("Tip amount: "+tip);
		System.out.println("Total bill: "+sumCharge);
		System.out.println("*************************************");
		
		
		
		

	}

}
