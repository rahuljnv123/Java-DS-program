import java.util.*;
public class ReverseBits
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = solution(n);
		System.out.println("RESULTS:"+res);
	}
	public static int solution(int n)
	{
		boolean flag = false;
		int rev = 0;
		int j = 0;
		for(int i=31;i>=0;i--)
		{
			int mask = 1<<i;
			if(flag)
			{
				if((n&mask)!=0)
				{
					int jmask = 1<<j;
					rev = rev | jmask;
				}
				j++;
			}
			else
			{
				if((n&mask)!=0)
				{
					int jmask = 1<<j;
					rev = rev | jmask;
					j++;
					flag = true;
				}
			}
		}
		return rev;
	}
}