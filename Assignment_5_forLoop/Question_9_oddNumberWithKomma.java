package assignments.Assignment_5_forLoop;

public class Question_9_oddNumberWithKomma {

	public static void main(String[] args) {
		
//		Write a program for the following logic:
//			Print all the odd numbers in comma-separated form 
//			  from 1 till the end (you may change it):
//			if end = 10, OUTPUT = 1, 3, 5, 7, 9
//			if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11
//
//			You should use while loop and if-else statements. 
//			Note that, there should not be any comma after the last digit.
		
		int n=20, i=1;
		
		out:while(i<=n) {
									
			if(i%2==1) {
								
				if(i==n || i==(n-1)) {
					System.out.print(i);	
					break out;
				}
				System.out.print(i + ", ");
			}
			i++;
		}

	}

}
