import java.util.Scanner;

public class FlipCoin {


	public static void main (String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of time u want to flip coin");
		int flipCount= s.nextInt();
		int headCount=0;
		int tailCount=0;
		
		for (int i=0; i<flipCount; i++){
			double random = Math.random();
			if (random > 0.5){
				headCount++;
			} else{
				tailCount++;
			}
		}
		
		System.out.println("HeadCount is: " + headCount + " % = " + calculatePercentage(flipCount, headCount));
		System.out.println("TailCount is: " + tailCount + " % = " + calculatePercentage(flipCount, tailCount));
	
	}
	
	private static int calculatePercentage (int flipCount, int count){
		int percentage = (count * 100) / flipCount;
		return percentage;
	}
	

}