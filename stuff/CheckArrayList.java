import java.util.*;
public class CheckArrayList
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int  t = sc.nextInt();
		while(t--!=0){
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			String st = sc.nextLine();
			list.add(st);
		}
		for(String word:list)
		{
			System.out.print(word + ",");
		}
		list.clear();
		System.out.println();
		}
	}
}