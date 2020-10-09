package assignments.Assignment_5_forLoop;

public class Question_11_nestedForLoop_Numbers {

	public static void main(String[] args) {
		
//		Print the following output using nested for loops.
//
//		4       3       2      1
//
//		     3       2      1
//
//		         2       1
//
//		              1

		int rows=6;
		for(int i=1;i<=rows;i++) {
			for(int a=2;a<=i;a++) {
				System.out.print("  ");
			}
			for(int j=rows+1;j>i;j--) {
				System.out.print(j-i+"   ");
			    }
			System.out.println();
			System.out.println();
		}
		

			
	}

}
