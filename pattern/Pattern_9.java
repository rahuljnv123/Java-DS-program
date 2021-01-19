import java.util.Scanner;
import java.lang.*;
class Pattern_9
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i>=3 && i<=n-1)
			{
				System.out.print("*");
				for(int j=1;j<=i-2;j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}