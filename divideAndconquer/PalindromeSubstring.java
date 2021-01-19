import java.util.*;
import java.lang.*;
public class PalindromeSubstring
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string:");
		String str = sc.nextLine();
		int n = str.length()-1;
		int res = function(str,0,n);
		System.out.print("output:"+res);
	}
	public static int function(String s,int start,int end)
	{
	
		if(start>end) return 0;
		if(start==end) return 1;
		int c1 = 0;
		if(s.charAt(start)==s.charAt(end))
		{
			int len = end-start-1;
			if(len == function(s,start+1,end-1))
			{
				c1 = 2+len;
			}
		}
		int c2 = function(s,start+1,end);
		int c3 = function(s,start,end-1);
		return Math.max(c1,Math.max(c2,c3));
	}
}