import java.util.*;
public class SpiralMatrix
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
		System.out.println("matirx print in spiral form:");
		for(int i=0;i<row;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else
			{
				for(int j=column-1;j>=0;j--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}
	}
}