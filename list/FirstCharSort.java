import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class FirstCharSort
{
	public static void main(String [] args)
	{
		List<String> names= new ArrayList<>();
		names.add("rahul");
		names.add("abhishek");
		names.add("suman");
		Collections.sort(names);
		System.out.println(names);
        		
	}
}