import java.util.*;
import java.lang.*;
public class MinEditdistances
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T--!=0)
		{
			int P = sc.nextInt();
			int Q = sc.nextInt();
			sc.nextLine();
			String str1 = "";
			for(int i=0;i<P;i++)
			{
				str1 = str1+sc.next();
			}
			String str2 = "";
			for(int i=0;i<Q;i++)
			{
				str2 = str2+sc.next();
			}
			int ans = editdistances(str1,str2);
			System.out.println(ans);
		}
	}
	public static int editdistances(String s1,String s2)
	{
		int m = s1.length();
		int n = s2.length();
		int dp[][] = new int [m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0)
				{
					dp[i][j] = j;
				}
				else if(j==0)
				{
					dp[i][j] = i;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					dp[i][j] = dp[i-1][j-1];
				}
				else{
					dp[i][j] = Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
				}
			}
		}
		return dp[m][n];
	}
}