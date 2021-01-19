import java.util.*;
public class FunOneToN
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("output");
		fun(n);
	}
	public static void fun(int n)
	{
		if(n==0)
		{
			return ;
		}
		else
		{
			fun(n-1);
			System.out.print(n+"  ");
		}
	}
}