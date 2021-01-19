import java.util.List;
import java.util.ArrayList;

public class AddAll
{
	public static void main(String []args )
	{
	    List<String> animals= new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        List<String> fruits= new ArrayList<>();
        fruits.add("orange");
        fruits.addAll(animals);
        System.out.println(fruits);		
	}
}