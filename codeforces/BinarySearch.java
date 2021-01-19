import java.util.*;
public class BinarySearch{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int pos = sc.nextInt();
		int res = solve(n);
		System.out.println(res);
	}
	public static int solve(int n )
	{
		long a = 1000000007;
		long  res = 1L;
		for(long i=1l;i<n;i++)
		{
			res = (res*i)%a;
		}
		//int c= (int)(res % a);
		return (int) res;
	}
}