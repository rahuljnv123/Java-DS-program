import java.util.Scanner;
class PrimeNum
{
	public static void main(String [] args)
	{
		int num;
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
			}
		}
		if(isPrime)
			System.out.println("NUMBER IS PRIME");
		else
			System.out.println("NUMBER IS NOT PRIME");
	}
}