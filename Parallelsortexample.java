import java.util.Arrays;

public class Parallelsortexample {

	public static void main(String[] args) {
	int [] a= {2,8,7,5,4,7,4,1,6,5};
		for (int i : a)
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");
		Arrays.parallelSort(a);
		for (int i : a) 
		{
			System.out.print(i+" ");
		}
	}

}
