import java.lang.*;
import java.util.*;
public class AnagramCount{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		Test obj= new Test();
		System.out.println(obj.solution(s));
		
	}
}
class Test{
	static int solution(String s){
		int n=s.length();
		if(n%2==1) return -1;
		String s1=s.substring(0,n/2);
		String s2=s.substring(n/2,n);
		Deque<Character> dq = new ArrayDeque<>();
		for(int i=0;i<s2.length();i++)
		{
			dq.add(s2.charAt(i));
		}
		
		int count=0;
		
		for(int i=0;i<s1.length();i++){
			if(!dq.contains(s1.charAt(i))){
				count++;
			}
		}
		return count;
	}
}