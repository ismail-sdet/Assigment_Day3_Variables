package Labs.Lab2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		
//		Write a program that will ask the user to enter the amount of a purchase. 
//		The program should then compute the state and county tax sales tax. 
//		Assume the state sales tax is 4 percent and the county sales tax is 2 percent. 
//		The program should display the 
//		- amount of the purchase , 
//		- the state sales tax, 
//		- the county sales tax, 
//		- the total sales tax, 
//		- and the total of the sale (which is the sum of the amount of purchase plus the total sales tax)
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter please the amount of your purchase: ");
		double costPurchase= sc.nextDouble();
		
		double stateTax = costPurchase*0.04;
		double countryTax= costPurchase*0.02;
		double totalTax = stateTax+countryTax;
		double totalAmount= costPurchase+totalTax;
		
		System.out.println("***************************************");
		System.out.println("Amount of the purchase: " + costPurchase);
		System.out.println("The state sales tax:   "+stateTax);
		System.out.println("The county sales tax:  "+countryTax);
		System.out.println("The total sales tax:   "+totalTax);
		System.out.println("The total of the sale: "+totalAmount);
		
	}

}
