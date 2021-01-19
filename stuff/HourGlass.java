import java.util.*;
import java.lang.*;
public class HourGlass
{
	public static void main(String [] args)
	{
		System.out.println("enter rows && column");
		int row,column;
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		column=sc.nextInt();
		int arr[][]= new int[row][column];
		System.out.println("enter element:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		test obj=new test();
		System.out.println(obj.solution(arr));
	}
}
class test
{
	public int solution(int arr[][])
	{
		int row=arr.length;
		int column=arr[0].length;
		int SumMax=Integer.MIN_VALUE;
		for(int i=0;i<row-2;i++)
		{
			for(int j=0;j<column-2;j++)
			{
				int CurrentSum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				SumMax=Math.max(SumMax,CurrentSum);
			}
		
		}
		return SumMax;
	}
}