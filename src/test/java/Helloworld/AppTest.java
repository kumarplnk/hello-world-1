import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest
{
	
	String s="hey";
	HelloWorld h=new HelloWorld();
	@Test
	public void test1()
	{
		
		String s1=h.sayHello(s);
		assertEquals(s,s1);
	}
	
	@Test
	public void test2()
	{
		
		String s2=h.sayHello(null);
		assertEquals(s2,"sayHello cant take an empty or null string");
	}
	@Test
	public void test3()
	{
		String s3=h.sayHello("");
		assertEquals(s3,"sayHello cant take an empty or null string");
	}
	
}