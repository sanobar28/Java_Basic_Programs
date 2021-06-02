import java.util.*;

public class WindChill
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Temperature");
		double temperature=s.nextDouble();
		System.out.println("Enter wind speed");
		double speed=s.nextDouble();
		
		double wind=0.0;
		
		if(temperature>50||(speed>120||speed<3))
		{
			System.out.println("This Formula is not valid for your input");
		}
		else
		{
			wind=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(speed,0.16);
			System.out.println("WindChill Number: "+wind);
		}
		s.close();
	}

}