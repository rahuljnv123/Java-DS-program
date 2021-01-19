import java.util.*;
import java.lang.*;
public class CommonSequence 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int l1 = sc.nextInt();
			int l2 = sc.nextInt();
			String str1 = "";
			while(str1.length()!=l1)
			{
				str1 = sc.next();
			}
			String str2 = "";
			while(str2.length()!=l2)
			{
				str2 = sc.next();
			}
			int ans = function(str1,str2);
			System.out.println("output: "+ans);
		}
	}
	public static int function(String str1 , String str2)
	{
		int m = str1.length();
		int n = str2.length();
		int dp[][] = new int[m+1][n+1];
		for(int i =0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || j==0)
				{
					dp[i][j] = 0;
				}
				else if(str1.charAt(i-1)==str2.charAt(j-1))
				{
					dp[i][j] = dp[i-1][j-1]+1;
				}
				else{
					dp[i][j] = Math.max(dp[i-1][j-1],Math.max(dp[i-1][j],dp[i][j-1]));
				}
			}
		}
		return dp[m][n];
	}
}