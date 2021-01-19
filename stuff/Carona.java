import java.util.*;
import java.lang.*;
public class Carona
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter test case:");
		int T = sc.nextInt();
		while(T--!=0){
			//System.out.println("enter array size");
		    int N= sc.nextInt();
		    //System.out.println("enter array elemnt:");
		    int [] arr = new int [N];
		    for(int i=0;i<N;i++)
		    {
			    arr[i]=sc.nextInt();
		    }
		
		    //PriorityQueue<Integer> pq = new PriorityQueue<>();
		    int count=1;
		    int maxLen= Integer.MIN_VALUE;
			int minLen= Integer.MAX_VALUE;
		    for(int i=0;i<N-1;i++)
		    {
			    if(arr[i+1]-arr[i]<=2)
				    count++;
			
			    else
			    {
					minLen=Math.min(minLen,count);
				    //pq.add(count);
				    count=1;
			    }
			    maxLen= Math.max(maxLen,count);
			}
			if(minLen==Integer.MAX_VALUE)
				minLen=maxLen;
				//pq.add(maxLen);
		
		    System.out.print(minLen+" "+maxLen);
		    System.out.println();
		    //pq.clear();
		}
	}
}