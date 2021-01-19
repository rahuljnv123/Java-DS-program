import java.util.*;
import java.lang.*;
public class String_1
{
	public static void main(String [] args)
	{
		String a="welcometojava";
		int n=a.length();
		List<String> test= new ArrayList<>();
		for(int i=0;i<n-2;i++)
		{
			test.add(a.substring(i,i+3));
		}
		Collections.sort(test);
		System.out.println(test);
		System.out.println(test.get(0));
		
		System.out.println(test.get(test.size()-1));
		
	}
	
}