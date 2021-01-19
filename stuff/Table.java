import java.util.Scanner;
public class Table{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int i=1;
		while(i<=10)
		{
			int r=num*i;
			i++;
			System.out.println(r);
		}
	}
}