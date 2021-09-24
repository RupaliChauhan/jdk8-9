import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Contesttant 
{
   String name;
	String phn_no;
	public  Contesttant(String n,String p)
	{
		this.name=n;
		this.phn_no=p;
	}
	public static void main(String[] args) 
	{
	ArrayList<Contesttant>li = new ArrayList<Contesttant>();
	   li.add(new Contesttant("Ram", "9912345678"));
	   li.add(new Contesttant("Shyam", "9912342222"));
	   li.add(new Contesttant("Ajay", "9912345770"));
	   li.add(new Contesttant("Vijay", "9912345678"));
	   li.add(new Contesttant("Jay", "9912345888"));
	   li.add(new Contesttant("Pappu", "9912345111"));
	   li.add(new Contesttant("InvalidNO", "11"));

	   
	   
	   li.stream().map(e-> e.phn_no).filter(e -> e.length() == 10).distinct()
	   .collect(Collectors.collectingAndThen(Collectors.toList(),
		e -> 
	   {
		   Collections.shuffle(e);
		   	return e.stream();
		   
	   })).limit(3).forEach(e ->System.out.println(e));
	   }
}