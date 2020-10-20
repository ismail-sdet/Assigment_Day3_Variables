package day14_methods_Part2;

public class Lab1_StringTimes {

	public static void main(String[] args) {
		
//		Write a method that accepts a string and a non-negative number, 
//		and prints a larger string that is number copies of the original String
		
		stringTimes("Hi", 2);
		stringTimes("Hi", 5);
		stringTimes("Hi", 1);

	}
	public static void stringTimes(String word, int a) {
		for(int b=a; b>0; b--) {
			System.out.print(word);
		}
		System.out.println();
	}	
	//    !!!!!!    OTHER WAY   !!!!!!!
	
//	stringTimes("Hi", 400);
//	
//}
//
//	public static void stringTimes(String string,int number) {
//	
//	String str = "";
//	
//	for(int i=0;i<number;i++) {
//		
//		str = str + string;   
//		
//	}
//	System.out.println(str);
//	
//}

}
