import java.util.*;
import java.lang.*;

public class AnagramGeeks
{
	public static void main(String arg [])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of test case:");
		int t= sc.nextInt();
		sc.nextLine();
		while(t--!=0)
		{
			System.out.println("enter string1:");
			String s1= sc.nextLine();
			System.out.println("enter string2:");
			String s2=sc.nextLine();
			test obj = new test();
			
			System.out.println(obj.function(s1,s2));
			
		}
	}
}
class test{
	public String function(String a , String b)
	{
		int n1=a.length();
		int n2=a.length();
		//boolean isAnagram= true;
		
		if(n1!=n2)
		{
			return "NO";
		}
		int arr[] = new int [26];
		for(int i=0;i<n1;i++)
		{
			char ch= a.charAt(i);
			int index= ch-'a';
			arr[index]++;
		}			
		for(int i=0;i<n2;i++)
		{
			char ch=b.charAt(i);
			int index=ch-'a';
			arr[index]--;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				return "NO";
			}
		}
		return "YES";
		
	}	
}