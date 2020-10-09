package assignments.Assignment_5_forLoop;

public class Question_13_BWBWBW {
	
//	Print following chessboard using nested for loops.
//	W B W B W B W B
//	B W B W B W B W
//	W B W B W B W B
//	B W B W B W B W
//	W B W B W B W B
//	B W B W B W B W
//	W B W B W B W B
//	B W B W B W B W
//
//	NOTE:
//	1. Total 8 rows and 8 columns.
//	2. "W" and "B" are in alternate positions 
//	(row-wise or column-wise), you will not find consecutive W or B.

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
				
		/*!!!! BETTER !!!
		 * 
		 * for(int i=1;i<=8;i++) {
  
  			  for(int j=1;j<=8;j++) {
    			   if ((i+j)%2!=0) {
      			        System.out.print("W ");
    			  }else {
    			         System.out.print("B ");
    		      }
  		       }
  	         	System.out.println();
		    }

		 */
	}

}



