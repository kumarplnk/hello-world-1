import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AppTest
{
	//String msg="hello world";
	//HelloWorld h=new HelloWorld();
	public void test1()
	{
		HelloWorld.sayHello(null);
		
	}
	public void test2()
	{
		HelloWorld.sayHello("");
	}
	public void test3()
	{
		HelloWorld.sayHello("hello world");
		
	}
}
	