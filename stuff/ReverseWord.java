import java.util.*;
import java.lang.*;
public class ReverseWord
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String str = sc.nextLine();
		
		String str1 = function(str);
		System.out.println(str1);
		
	}
	public static String function(String s)
	{
		int i = s.length()-1;
		StringBuilder st_b = new StringBuilder();
		while(i>=0)
		{
			while(i>=0 && s.charAt(i)==' ') i--;
			
			int j= i;
			
			if(i<0) break;
			
			while(i>=0 && s.charAt(i)!=' ') i--;
			
			if(st_b.length()==0)
			{
				st_b.append(s.substring(i+1,j+1));
			}
			else
			{
				String ch = " ";
				st_b.append(ch);
				st_b.append(s.substring(i+1,j+1));
			}
		}
		return st_b.toString();
		
	}
}