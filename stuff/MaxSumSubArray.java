import java.util.*;
import java.lang.*;
public class MaxSumSubArray
{
	public static void main(String args[])
	{
		int arr[]={2,-3,2,4,-1,2,3,-2};
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		int cursum=0;
		for(int i=0;i<n;i++)
		{
			cursum=cursum+arr[i];
			max=Math.max(max,cursum);
			if(cursum<0)
			{
				cursum=0;
			}
		}
		System.out.println(max);
	}
}