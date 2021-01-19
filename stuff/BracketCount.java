import java.util.*;
import java.lang.*;
public class BracketCount
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//String s= sc.nextInt();
		Stack<Character> st= new Stack<>();
		Stack<Integer> dc=new Stack<>();
		System.out.println("enter string:");
		String s=sc.nextLine();
		int count=1;
		int d_count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				st.push(s.charAt(i));
				System.out.print(count+" ");
				d_count=count;
				count++;
			}
			else
			{
				char pop_val=st.pop();
				if(s.charAt(i)==')' && pop_val=='(')
				{
					if(dc.contains(d_count))
					{
						while(dc.contains(d_count))
						{
							d_count--;
						}
						System.out.print(d_count+" ");
					}
					else{
						System.out.print(d_count+" ");
						dc.push(d_count);
						d_count--;
					}
				}
			}
		}
	}
}