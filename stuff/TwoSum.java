import java.util.*;
import java.lang.*;

public class TwoSum{
	public static void main(String []args){
		int arr[]={2,7,89,8};
		int target=9;
		//Scanner sc =new Scanner(System.in);
		SumCheck obj= new SumCheck();
		obj.solution(arr,target);
		
		
	}
}
class SumCheck{
	public int[] solution(int a[],int t){
		Map<Integer,Integer> hm= new HashMap<>();
		for(int i=0;i<a.length;i++){
			int comp=t-a[i];
			if(hm.containsKey(comp)){
				System.out.print(hm.get(comp)+" "+i);
			}
			hm.put(a[i],i);
		}
		throw new IllegalArgumentException("no match found");
	}
}