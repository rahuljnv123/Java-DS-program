/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		while(T--!=0){
		    String S=sc.nextLine();
		    BracketCount obj= new BracketCount();
		    System.out.println(obj.solution(S));
		    
		}
	}
}
class BracketCount{
    public int solution(String s)
    {
        int count=1;
        int d_count=0;
        Stack<Character> st= new Stack<>();
        Stack<Integer> dc= new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
                System.out.print(count+" ");
                d_count=count;
                count++;
            }
            else{
                if(st.isEmpty()) return 0;
                else
                {
                    //char pop_val=st.pop();
                    if(s.charAt(i)==')')
                    {
						char ch=')';
						while(ch!='(')
						{
							ch=st.pop();
						}
                        if(dc.contains(d_count))
                        {
                            while(dc.contains(d_count))
                            {
                                d_count--;
                            }
                            System.out.print(d_count+" ");
                        }
                        else
                        {
                            System.out.print(d_count+" ");
                            dc.push(d_count);
                            d_count--;
                        }
                    }
                }
            }
        }
        return 0;
    }
}
