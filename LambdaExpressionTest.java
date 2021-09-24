
public class LambdaExpressionTest {

	public static void main(String[] args)
	{
    //(without lambda Expression)
//      AnonymousTest a=new AnonymousTest()
//      {
//		public void say()
//		{
//			System.out.println("hello guys");
//		}
//	};
//	 a.say();
		
	AnonymousTest a1 = (x,y)->{
		int c=(x+y);
		System.out.println(c);
	};
	a1.add(20,30);
		
	}
		

}

