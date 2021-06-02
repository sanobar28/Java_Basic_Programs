
import java.util.Scanner;

public class QuotientRemainder {

  public static void main(String[] args){
        
        int dividend, divisor, quo, rem;
        Scanner in = new Scanner(System.in);
        
        //get the dividend value
        System.out.print("Enter Dividend:");
        dividend = in.nextInt();
        
        //get the divisor value 
        System.out.print("Enter Divisor:");
        divisor = in.nextInt();
        
        //find quotient 
        quo = dividend / divisor;
        
        //find reminder
        rem = dividend % divisor;
        
        //print the result
        System.out.println("Quotient: "+quo);
        System.out.println("Remainder: "+rem);
    }
}