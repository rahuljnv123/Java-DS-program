import java.util.*;
import java.lang.*;
public class CoinChange
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int coins[] = new int[n];
        for(int i=0;i<n;i++)
		{
			coins[i] = sc.nextInt();
		}
        int val = sc.nextInt();
        int res  = function(coins,val);
        System.out.println(res);		
	}
	public static int function(int arr[],int v)
	{
		int n = arr.length;
		int dp[][] = new int [n+1][v+1];
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=v;j++)
			{
				if(i==0)
				{
					dp[i][j] = 0;
				}
				else if(j ==0)
				{
					dp[i][j] = 1;
				}
				else if(j<arr[i-1])
				{
					dp[i][j] =dp[i-1][j]; 
				}
				else
				{
					dp[i][j] = dp[i-1][j]+dp[i][j-arr[i-1]];
				}
			}
		}
		return dp[n][v];
	}
}