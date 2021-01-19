import java.util.List;
import java.util.ArrayList;
public class CreateArrayList
{
	public static void main(String [] args)
	{
		List<String> fruits=new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		System.out.println(fruits);
		
		// add element at particular position
		fruits.add(1,"grapes");
		
		System.out.println(fruits);
		
	}
}