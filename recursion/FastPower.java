import java.util.*;
import java.lang.*;

public class FastPower
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER a:");
		int a = sc.nextInt();
		System.out.print("ENTER b:");
		int b = sc.nextInt();
		
		int res = power_cal(a,b);
		System.out.print("OUTPUT:"+res);
		
	}
	
	public static int power_cal(int a , int b)
	{
		if(b == 0) 
			return 1;
		else if(b%2 == 0)
			return power_cal(a*a,b/2);
		else
			return a*power_cal(a,b-1);
	}
}
