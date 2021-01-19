import java.util.Scanner;
class  solution
{
	public String reverseword(String s)
	{
		int i=s.length()-1;
		String ans="";
		while(i>=0)
		{
			while(i>=0 && s.charAt(i)==' ')
				i--;
			int j=i;
			if(i<0)
				break;
			while(i>=0 && s.charAt(i)!=' ')
				i--;
			if(ans.isEmpty())
			{
				ans=ans.concat(s.substring(i+1,j+1));
			}
			else
			{
				ans=ans.concat(" "+s.substring(i+1,j+1));
			}
		}
		return ans;
	}
}
public class  ReverseMain
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string:");
		String a=sc.nextLine();
		solution obj=new solution();
		System.out.println(obj.reverseword(a));
		
	}
}