package assignments.Assignment_5_forLoop;

public class Question_12_nestedForLoop {

	public static void main(String[] args) {
		
		int rows=10;
		int columns=10;
		
		for (int i=1; i<=rows; i++) {
			
			for(int j=1; j<=columns; j++) {				
				System.out.print(i*j+ " ");					
			}
			
			System.out.println(); 
		}
		
		
		
		

	}

}
