import java.util.*;
public class FibbonacciNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:");
		int n = sc.nextInt();
		int res = fibbo(n);
		System.out.println("result : "+res);
	}
	public static int fibbo(int n)
	{
		if(n==1) return 0;
		else if(n==2) return 1;
		else
		{
			return fibbo(n-1)+fibbo(n-2);
		}
	}
}