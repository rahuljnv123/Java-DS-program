import java.util.*;
import java.lang.*;

public class JavaDequeue
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter size");
		int n=sc.nextInt();
		int arr [] =new int [n];
		//System.out.println("enter array element:");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		//System.out.println("enter k sizze");
		int k=sc.nextInt();
		
		Deque<Integer> deque = new ArrayDeque<>();
		int j=0;
		int count=0;
		int max=0;
		while(j<n)
		{
			if(j<k)
			{
				if(!deque.contains(arr[j]))
				{
					count++;
					deque.add(arr[j]);
					j++;
				}
				else
				{
					deque.add(arr[j]);
					j++;
					//System.out.print(count+" ");
					max=Math.max(max,count);
				}
			}
			else{
				int num=deque.remove();
				if(!deque.contains(num))
				{
					count--;
				}
				if(!deque.contains(arr[j]))
				{
					count++;
					deque.add(arr[j]);
					j++;
				}
				else{
					deque.add(arr[j]);
					j++;
				}
				max=Math.max(max,count);
				//System.out.print(count+" ");
			}
			//System.out.println(max);
		}
		System.out.println(max);
	}
}