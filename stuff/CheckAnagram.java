import java.util.*;
import java.lang.*;
public class CheckAnagram
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter both string");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(solve(s1,s2))
		{
			System.out.println("YESSS");
		}
		else
		{
			System.out.println("NOOO");
		}
	}
	public static boolean solve(String s1 , String s2)
	{
		int n = s1.length();
		int m = s2.length();
		
		if(n!=m)
		{
			return false;
		}
		
		int arr[] = new int[256];
		for(char ch:s1.toCharArray())
		{
			int k = (int) ch;
			arr[k] = arr[k]+1;
		}
		for(char ch:s2.toCharArray())
		{
			int k = (int) ch;
			arr[k] = arr[k]-1;
		}
		for(int i=0;i<256;i++)
		{
			if(arr[i] !=0)
			{
				return false;
			}
		}
		return true;
	}
}