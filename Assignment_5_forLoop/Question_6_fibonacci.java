package assignments.Assignment_5_forLoop;

import javax.print.attribute.standard.Fidelity;

public class Question_6_fibonacci {

	public static void main(String[] args) {
		
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
