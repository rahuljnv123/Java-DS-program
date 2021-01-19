import java.util.*;
import java.lang.*;
public class TwoSum{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO-OF TEST CASES:");
        int t= sc.nextInt();
		while(t--!=0)
		{
			System.out.println("ENTER ARRAY SIZE:");
			int n=sc.nextInt();
			int arr[]= new int[n];
			System.out.println("ENTER ARRAY ELEMENT:");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("ENTER TARGET:");
			int target=sc.nextInt();
			solution obj = new solution();
		    int [] b = obj.function(arr,target);
            for(int i=0;i<b.length;i++)
			{
				System.out.print(b[i]+",");
			}
            System.out.println();
			
		}
        		
	}
}
class solution{
	int [] function(int a[],int k)
	{
		Map<Integer,Integer> hm = new HashMap<>();
		hm.put(0,-1);
		for(int i=0;i<a.length;i++){
			int comp=k-a[i];
			if(hm.containsKey(comp))
			{
				return new int [] {hm.get(comp),i};
			}
			hm.put(a[i],i);
		}
		throw new IllegalArgumentException("no match found");
	
	}
}