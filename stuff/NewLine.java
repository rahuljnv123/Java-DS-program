import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class NewLine
{
	public static void main(String [] args)
	{
		List<String> names= new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		int i=1;
		while(sc.hasNext())
		{
			System.out.println(i+" "+sc.nextLine());
			i++;
		}
		sc.close();
		
	}
}