import java.util.*;
import java.lang.*;
public class SumFirstNnumber
{
	public static void main(String [] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER N:");
		int n = sc.nextInt();
		int sum = print_sum(n);
		System.out.println("OUTPUT:" + sum);
		
	}
	public static int print_sum(int n)
	{
		if(n==1) return 1;
		else
		{
			return n+print_sum(n-1);
		}
	}
	
}