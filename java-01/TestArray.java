public class TestArray
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40};
		//traversing of array
		//a.length=return the length of array
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();  //change of line
		float sum=0,avg=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("sum="+sum);
		System.out.println("average="+avg);
	}
}