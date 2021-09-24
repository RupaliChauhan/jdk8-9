import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest
{
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList();
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("four");
		
		Stream  s= a.stream();
	
		a.stream().forEach(e->{System.out.println(e);});
		
		
	}
}
