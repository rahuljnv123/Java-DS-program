import java.util.*;
import java.lang.*;
public class MaxProfitRodcutting
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		System.out.print("enter rod length:");
		int n = sc.nextInt();
		int p[] = new int [n];
		System.out.println("enter cutting price:");
		for(int i =0;i<n;i++)
		{
			p[i] = sc.nextInt();
		}
		int res = function(p,n);
		System.out.println("maximun profit: "+res);
		
		
	}
	public static int function(int arr[] , int n)
	{
		int dp[][] = new int [n+1][n+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0 || j==0)
				{
					dp[i][j] = 0;
				}
				else if(i==1)
				{
					dp[i][j] = j*arr[0];
				}
				else if(j<i)
				{
					dp[i][j] = dp[i-1][j];
				}
				else{
					dp[i][j] = Math.max(dp[i-1][j],arr[i-1]+dp[i][j-i]);
				}
			}
		}
		return dp[n][n];
	}
}