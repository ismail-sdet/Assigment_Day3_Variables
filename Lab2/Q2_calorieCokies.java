package Labs.Lab2;

import java.util.Scanner;

public class Q2_calorieCokies {

	public static void main(String[] args) {
		
//		A bag of cookies holds 40 cookies. The calorie information on the bag claims that 
//		there are 10 serving in the bag and that a serving equals 300 calories. 
//		write a program that lets the user enter the number of cookies he or she actually 
//		ate and then reports the number of total calories consumed.
		
		Scanner sc = new Scanner (System.in); 
		
		System.out.print("Enter please the number of cookies that you ate:");
		
		int numCookies= sc.nextInt();
		
		int calorie=75;
		int sumCalorie = calorie*numCookies;
		
		System.out.println("Total calories: "+sumCalorie);
		
		
	}

}
