import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;
import static org.junit.Assert.*;
public class HelloWorldTest
{
	private static final String s="java";
	HelloWorld h=new HelloWorld();
	@Test
	public void testsayHelloWhenInputParamIsString()
	{
		assertEquals("hello world java",h.sayHello(s));
	}
	//passing null string
	@Test(expected=IllegalArgumentException.class)
	public void testsayHelloWhenInputParamIsNull()
	{
		h.sayHello(null);
	}
	//passing empty string
	@Test(expected=IllegalArgumentException.class)
	public void testsayHelloWhenInputParamIsEmptyString()
	{
		h.sayHello("");
	}
	//passing White spacess
	@Test(expected=IllegalArgumentException.class)
	public void testsayHelloWhenInputParamIsWhiteSpaces()
	{
		h.sayHello("        ");
	}
	
}