package assignments.Assignment_5_forLoop;

import javax.print.attribute.standard.Fidelity;

public class Question_6_fibonacci {

	public static void main(String[] args) {
		
//		Write a program to print Fibonacci series of n terms 
//		where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
		
		 int n = 15, t1 = 0, t2 = 1;
	        System.out.println("First " + n + " terms: ");

	        for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(t1+"  ");

	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }

	}

}
