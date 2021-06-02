import java.util.Scanner;

public class Harmonic {

  public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num= s.nextInt();
	
		for (int count=1; count<=num; count++){
		
			if (num == 1){
				String series= "1/" + count;
				System.out.print(series);
			}
			else if (num == count){
				String series= "1/" + count;
				System.out.print(series);
			}
			else{
				System.out.print("1/" + count + "+");
			}
		}
	
	}
}