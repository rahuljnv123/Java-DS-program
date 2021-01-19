import java.util.Scanner;
public class LeftRotation
{
	public static void main(String [] args)
	{
		int n,t;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size:");
		n=sc.nextInt();
		System.out.println("enter t:");
		t=sc.nextInt();
		int a[] =new int[n];
		System.out.println("enter element:");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("after rotation:");
		while(t>0)
		{
		    int temp=a[0];
		    for(int i=0;i<n-1;i++)
		    {
			    a[i]=a[i+1];
		    }
		    a[n-1]=temp;
			t--;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}