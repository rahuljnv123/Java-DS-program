import java.util.*;
import java.io.*;
import java.lang.*;
public class LongestSubstring{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no-of test case:");
		int t=sc.nextInt();
		sc.nextLine();
		while(t--!=0)
		{
			System.out.println("enter string");
			String str=sc.nextLine();
			solution obj= new solution();
			System.out.println("max_length:" + obj.function(str));
			System.out.println();
			
		}
	}
}
class solution
{
	public int function(String s)
	{
		Set<Character> set= new HashSet<>();
		int i=0;
		int j=0;
		int max=0;
		while(j<s.length())
		{
			if(!set.contains(s.charAt(j)))
			{
				set.add(s.charAt(j));
				j++;
				max=Math.max(max,set.size());
			}
			else
			{
				set.remove(s.charAt(i));
				i++;
			}
		}
		return max;
	}
}