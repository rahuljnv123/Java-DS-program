import java.lang.*;
import java.util.*;
public class LongestSubarray{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER TEST CASES:");
		int t=sc.nextInt();
		while(t--!=0){
			System.out.println("ENTER ARRAY SIZE:");
			int n=sc.nextInt();
			int [] arr= new int[n];
			System.out.println("ENTER ARRAY ELEMENT:");
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			System.out.println("ENTER TARGET:");
			int target=sc.nextInt();
			
			HashMap<Integer,Integer> hmap= new HashMap<>();
			int sum=0;
			int max=Integer.MIN_VALUE;
			
			for(int i=0;i<n;i++){
				sum=sum+arr[i];
				int comp=sum-target;
				if(hmap.containsKey(comp)){
					int index=i-hmap.get(comp);
					max=Math.max(max,index);
				}
				if(!hmap.containsKey(sum)){
					hmap.put(sum,i);
				}
			}
			System.out.println(max);
		}
	}
}