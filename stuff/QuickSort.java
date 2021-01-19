import java.util.*;
import java.lang.*;
public class QuickSort
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size: ");
		int n = sc.nextInt();
		System.out.println("enter array element");
		int arr[] = new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		solve(arr,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void solve(int arr[],int low,int high)
	{
		if(low<high)
		{
			int p = partition(arr,low,high);
			solve(arr,low,p-1);
			solve(arr,p+1,high);
		}
	}
	public static int partition(int arr[],int low,int high)
	{
		int pivot = arr[high];
		int i = low;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				i++;
			}
		}
		int t = arr[i];
		arr[i] = pivot;
		arr[high] = t;
		return i;
	}
}