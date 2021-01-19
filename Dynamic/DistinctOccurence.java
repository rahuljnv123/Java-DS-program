import java.util.*;
import java.lang.*;
public class DistinctOccurence
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//int m = str.length()-1;
		String sq = sc.nextLine();
		//int n = sq.length()-1;
		int res = function(str,sq);
		System.out.println("OUTPUT:"+res);
	}
	public static int function(String s,String t)
	{
		int m = s.length();
		int n = t.length();
		
		if(n>m) return 0;
		if(m==0) return 0;
		if(n==0) return 1;
		
		int dp[][] = new int [n+1][m+1];
		for(int i=1;i<=n;i++)
		{
			dp[i][0] = 0;
		}
		for(int i=0;i<=m;i++)
		{
			dp[0][i] = 1;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(t.charAt(i-1)!=s.charAt(j-1))
				{
					dp[i][j] = dp[i][j-1];
				}
				else
				{
					dp[i][j] = dp[i-1][j-1]+dp[i][j-1];
				}
			}
		}
		return dp[n][m];
	}
}