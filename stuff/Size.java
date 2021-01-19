import java.util.*;
import java.io.*;
public class Size{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String pat = sc.nextLine();
		int res = solve(str,pat);
		System.out.println("OUTPUT:"+res);
	}
	
	public static int solve(String str , String pat){
		int n = str.length();
		int w = pat.length();
		
		int res[] = new int[26];
		int count = 0;
		
		for(int i=0;i<w;i++){
			res[pat.charAt(i)-'a'] +=1;
			//res[str.charAt(i)-'a'] -=1;
		}
		for(int i=0;i<w;i++){
			res[pat.charAt(i)-'a'] -=1;
		}
		for(int i=w;i<n;i++){
			if(isZero(res)){
				count++;
			}
			
			res[str.charAt(i)-'a'] +=1;
			res[str.charAt(i-w)-'a'] -=1;
		}
		if(isZero(res)){
			count++;
		}
		
		return count;
	}
	public static boolean isZero(int res[]){
		for(int i=0;i<26;i++){
			if(res[i]!=0){
				return false;
			}
		}
		return true;
	}
}