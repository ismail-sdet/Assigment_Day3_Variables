package assignments.Assignment_5_forLoop;

public class Question_14_nestedLoop_pattern {

	public static void main(String[] args) {
		
		int rows=7;
		for(int i=1;i<=rows;i++) {			
			System.out.print("#");
			
			for(int k=1; k<i; k++) {
				System.out.print(" ");
			}
			System.out.print("#");						
			System.out.println();			
		}
		

	}

}
