import java.util.ArrayList;

public class ForEachTest
{
	public static void main(String[] args) {
		
		ArrayList a =new ArrayList();
		a.add(12);
		a.add(6);
		a.add(8);
		a.add(8);
		a.add(12);
		a.add(17);
		
//		for (Object object : a) 
//		{
//			System.out.println(object);
//		}
		a.forEach(li->System.out.println(li));
	}
}
