import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AppTest
{
	String msg="hello world";
	HelloWorld h=new HelloWorld();
	public void testPrint()
	{
		assertEquals(msg,h.sayHello());
		
	}
}
	