import java.util.*;
import java.lang.*;
class CharArray{
	public static void main(String [] args)
	{
		String name="madam";
		int n=name.length();
		boolean isPalindrome=true;
		char a[]= new char[n];
		for(int i=0;i<n;i++)
		{
			a[i]=name.charAt(i);
		}
		char b[]=new char[n];
		int j=0;
		for(int i=n-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		for(int i=0;i<n;i++)
		{
			if(a[i] !=b[i]){
			    isPalindrome=false;
			    break;
			}
		}
		if(isPalindrome)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}