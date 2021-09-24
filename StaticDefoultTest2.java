
public class StaticDefoultTest2 
{
	public static void main(String[] args)
	{
		StaticDefaultTest s1  = new StaticDefaultTest()
		{
			public void say()
			{
			System.out.println("functional");
			}
		};	

    s1.say();
	s1.print();
	StaticDefaultTest.show();
	}
	
	
}
	


