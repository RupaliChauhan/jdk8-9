import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapTest {

	public static void main(String[] args)
	{
	ArrayBlockingQueue<String> ab=new  ArrayBlockingQueue<String>(4);
	ab.add("ab");
	ab.add("bb");
	
	Iterator it=ab.iterator();
	ab.add("cc");
	while (it.hasNext()) {
		Object object = (Object) it.next();
		System.out.println(object);
		
	}

	}

}
