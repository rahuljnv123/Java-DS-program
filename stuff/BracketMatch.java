import java.lang.*;
import java.util.*;
public class BracketMatch
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter test case");
		int t=sc.nextInt();
		sc.nextLine();
		while(t--!=0)
		{
			System.out.println("enter String:");
			String s=sc.nextLine();
			Check obj= new Check();
			System.out.println(obj.solution(s));
		}
		
		
	}
}
class Check{
	public String solution(String s)
	{
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
				st.push(s.charAt(i));
			else
			{
				if(st.isEmpty())return "not balanced";
				else{
					char pop_val=st.pop();
					if(s.charAt(i)==')' && pop_val!='(')
						return "not balanced";
				    else if(s.charAt(i)=='}' && pop_val!='{')
					    return "not balanced";
					else if(s.charAt(i)==']' && pop_val!='[')
					    return "not balanced";
				}
				
			}
		}
		if(st.isEmpty())
			return "balanced";
		else
			return "not balanced";
	}
}