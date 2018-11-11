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
		assertEquals(s,h.sayHello(s));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test2()
	{
		h.sayHello(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test3()
	{
		h.sayHello("");
	}
	
}