import java.util.Scanner;

public class PowersOfTwo {

    public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no.: \t");
		int num= s.nextInt();
		
		for(int count=1; count<=num; count++){
			
			System.out.println( (int) Math.pow(2, count));
		
		}
		

	}
}