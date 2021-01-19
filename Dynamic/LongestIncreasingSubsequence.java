import java.util.*;
import java.lang.*;
public class LongestIncreasingSubsequence
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter array size:");
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int res = function(arr,n);
		System.out.println("output:"+res);
	}
	public static int function(int arr[] , int n)
	{
		int dp[] = new int [n];
		Arrays.fill(dp,1);
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					dp[i] = Math.max(dp[i],dp[j]+1);
				}
			}
		}
		int max = dp[0];
		for(int i=1;i<n;i++)
		{
			if(dp[i]>max)
			{
				max = dp[i];
			}
		}
		return max;
	}
	
}