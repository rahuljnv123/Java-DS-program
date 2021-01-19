import java.util.*;
public class ZeroSum
{
	public static void main(String[]args)
	{
		int arr[]={4,2,-3,1,6};
		int sum=0;
		boolean found=false;
		Set<Integer>sets= new HashSet<>();
		for(int e:arr){
			sets.add(sum);
			sum=sum+e;
			if(sets.contains(sum))
			{
				found = true;
				break;
			}
		}
		if(found)
		{
			System.out.println("FOUND");
		}
		else
		{
			System.out.println("NOT FOUND");
			//System.out.println("NOT FOUND");
		}
	}
}