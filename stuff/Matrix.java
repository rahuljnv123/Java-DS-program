import java.util.*;
import java.lang.*;
public class Matrix
{
	public static void main(String [] args)
	{
		int dp[][] = new int[3][2];
		Arrays.fill(dp,-1);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(dp[i][j] +" ");
			}
			System.out.println();
		}
	}
}