public class SubArray
{
	public static void main(String [] args)
	{
		int arr[]={1,-2,4,-5,1};
		int count=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+arr[j];
				if(sum<0)
					count++;
			}
		}
		System.out.println(count);
	}
}