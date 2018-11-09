class HelloWorld
{
	
	public static String sayHello(String msg)
	{
		if(msg!=null && !msg.isEmpty())
		{
		System.out.print(msg);
		return msg;
		}
		else
		{
			if(msg==null)
				return "msg cant be NULL";
			else
				return "msg cant be empty";
			
		}
	}
	
}