class HelloWorld
{
	
	public String sayHello(String msg)
	{
		if(msg==null || msg.isEmpty())
		{
			try{
				throw new Exception("sayHello cant take an empty or null string");
			}catch(Exception e)
			{
				System.out.print(e);
				String emsg=e.getMessage();
				return emsg;
				
			}
		}
		else
		{
			System.out.print(msg);
			return msg;
		}
		
	}
	
}