import org.junit.rules.ExpectedException;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest
{
	private static final String TEST_STR="java";
	HelloWorld classUnderTest=new HelloWorld();
	@Test
	public void testsayHelloWhenInputParamIsString()
	{
		assertEquals("hello world java",classUnderTest.sayHello(TEST_STR));
	}
	//passing null string
	@Test(expected=IllegalArgumentException.class)
	public void testsayHelloWhenInputParamIsNull()
	{
		classUnderTest.sayHello(null);
		fail("should throw exception");
	}
	//passing empty string
	@Test(expected=IllegalArgumentException.class)
	public void testsayHelloWhenInputParamIsEmptyString()
	{
		classUnderTest.sayHello("");
		fail("should throw exception");
	}
	//passing White spacess
	@Test(expected=IllegalArgumentException.class)
	public void testsayHelloWhenInputParamIsWhiteSpaces()
	{
		classUnderTest.sayHello("        ");
		fail("should throw exception");
	}
}


	