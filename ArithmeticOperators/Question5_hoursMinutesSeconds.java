package assigments.ArithmeticOperators;

public class Question5_hoursMinutesSeconds {

	public static void main(String[] args) {
		
		int hour, minute, second, inputSecond;
		
		inputSecond = 8500;
		
		second = inputSecond % 60;
		hour   = inputSecond / 3600;
		minute = (inputSecond % 3600) /60;
					
			System.out.println("inputSecond is : " + inputSecond+ "\n"+hour + " hours " + minute + " minutes " +second + " seconds");
		
	}

}
