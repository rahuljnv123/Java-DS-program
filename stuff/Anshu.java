import java.util.*;
public class Anshu
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER NUM:");
		int num = sc.nextInt();
		int rev = 0;
		while(num!=0)
		{
			int rem = num%10;
			num = num/10;
			rev = rev*10+rem;
		}
		System.out.print("AFTER REVERSE:"+rev);

		
	}
}