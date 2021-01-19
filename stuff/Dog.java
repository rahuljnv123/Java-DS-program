import java.util.*;
public class Dog
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = fun(n);
		System.out.println("output:" + res);
		
		
	}
	public static int fun(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		else{
			return fun(n-2)+fun(n-1);
		}
	}
	

	
}