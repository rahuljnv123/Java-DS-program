public class ArrayMultiplication
{
    public static void main(String[]args)
	{
		int arr[]={1,2,3,4};
		int n=arr.length;
		int mul[]=new int[n];
	
		
		for(int i=0;i<n;i++)
		{
			int res=1;
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					res=res*arr[j];
				}
			}
			mul[i]=res;
			System.out.print(mul[i]+" ");
		}
		
			
	}
 
}
