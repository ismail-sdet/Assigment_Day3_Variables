package assignments.Assignment_5_forLoop;

public class Question_9_oddNumberWithKomma {

	public static void main(String[] args) {
		
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
