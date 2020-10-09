package assignments.Assignment_5_forLoop;

public class Question_8_calculate {

	public static void main(String[] args) {
		
//		Write a program to calculate the sum of the numbers 
//		from 1 till upper bound.
//		If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
//		If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
//		If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
//
//		You should use a while loop.
		
		int i=1;
		int sum=0;
		int n=11;
		
		out:while(i<=n) {
			if(i==n) {
				sum=i+sum;
			    System.out.print(i);
				break out;
			}
			System.out.print(i + " + ");
			sum=sum+i;
			i++;			
		}
		System.out.print(" = " + sum);
		

	}

}
