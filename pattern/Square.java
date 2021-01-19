import java.util.*;
public class Square
{
	public static void main(String args[])
	{
		System.out.println("enter n:");
		Scanner s=new Scanner(System.in);
		int len=s.nextInt();
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}