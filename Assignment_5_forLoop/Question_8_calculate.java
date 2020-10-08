package assignments.Assignment_5_forLoop;

public class Question_8_calculate {

	public static void main(String[] args) {
		
		int i=1;
		int sum=0;
		int n=11;
		
		out:while(i<=n) {
			if(i==n) {
				sum=i+sum;
			    System.out.print(i);
				break out;
			}
			System.out.print(i + " + ");
			sum=sum+i;
			i++;			
		}
		System.out.print(" = " + sum);
		

	}

}
