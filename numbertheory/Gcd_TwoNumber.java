import java.util.*;
class Gcd_TwoNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int g = gcd(a,b);
        System.out.println("GCD:"+g);		
		
	}
	static int gcd(int p , int q)
	{
		if(q==0)
		{
			return p;
		}
		return gcd(q,p%q);
	}
}