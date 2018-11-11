
class HelloWorld
{
	
	public String sayHello(String msg) throws IllegalArgumentException
	{
		if(msg==null || msg.isEmpty())
		{
			throw new IllegalArgumentException("msg cant be null or empty");
		}
		
			System.out.print(msg);
			return msg;
		
	}
	
}