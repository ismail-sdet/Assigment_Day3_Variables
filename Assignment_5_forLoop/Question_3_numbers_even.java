package assignments.Assignment_5_forLoop;

public class Question_3_numbers_even {

	public static void main(String[] args) {
		
//		Write a program that displays the number
//		of even numbers between 5 and 50 (included)
		
		int i = 5;
		while(i<=50) {
			
			if(i%2==0) {
			System.out.println(i);			
			}
			i++;
		}
			
	}

}


