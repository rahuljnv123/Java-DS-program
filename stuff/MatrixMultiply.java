import java.util.*;
import java.lang.*;
public class MatrixMultiply
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter matrix size:");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		System.out.println("enter MATRIX A:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("OUTPUT:");
		int count = 0;
		int tcn = n*n;
		int mr = 0;
		int mc = 0;
		int xr = n-1;
		int xc = n-1;
		while(count<tcn)
		{
			for(int i=mr ,  j=mc;i<=xr && count<tcn;i++)
			{
				System.out.print(a[i][j]+" ");
				count++;
			}
			mc++;
			for(int i=xr,j=mc;j<=xc && count<tcn;j++)
			{
				System.out.print(a[i][j]+" ");
				count++;
			}
			xr--;
			for(int i=xr ,j=xc;i>=mr && count<tcn;i--)
			{
				System.out.print(a[i][j]+" ");
				count++;
			}
			xc--;
			for(int i=mr ,  j=xc;j>=mc && count<tcn;j--)
			{
				System.out.print(a[i][j]+" ");
				count++;
			}
			mr++;
		}
		
	}
}