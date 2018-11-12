import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;
import static org.junit.Assert.*;
public class HelloWorldTest
{
	String s="hello  world";
	HelloWorld h=new HelloWorld();
	@Test
	public void test1()
	{
		assertEquals(s,h.sayHello(s));
	}
	//passing null string
	@Test(expected=IllegalArgumentException.class)
	public void test2()
	{
		h.sayHello(null);
	}
	//passing empty string
	@Test(expected=IllegalArgumentException.class)
	public void test3()
	{
		h.sayHello("");
	}
	//passing White spacess
	@Test(expected=IllegalArgumentException.class)
	public void test4()
	{
		h.sayHello("             ");
	}
	
}