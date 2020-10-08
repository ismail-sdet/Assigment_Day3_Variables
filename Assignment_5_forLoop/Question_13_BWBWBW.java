package assignments.Assignment_5_forLoop;

public class Question_13_BWBWBW {

	public static void main(String[] args) {		
		int row=8;
		int column=8;		
		for (int i=1; i<=row; i++) {
						
			for (int j=1; i%2==1&&j<=column; j+=2) {				
		    	System.out.print("B");
		    	System.out.print("W");
			}	
			for(int k=1;i%2==0 && k<=column; k+=2) {
				System.out.print("W");
				System.out.print("B");
			}
			System.out.println();
		}
				
		
	}

}
