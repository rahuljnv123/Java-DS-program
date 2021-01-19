import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class IntegerSort
{
	public static void main(String [] args)
	{
		List<Integer> num= new ArrayList<>();
		num.add(6);
		num.add(4);
		num.add(29);
		num.add(1);
		System.out.println("Before:"+num);
		Collections.sort(num);
		System.out.println("After:"+num);
	}
}