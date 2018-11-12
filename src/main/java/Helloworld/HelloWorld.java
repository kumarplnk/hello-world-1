class HelloWorld
{
	public String sayHello(String msg) throws IllegalArgumentException
	{
		if(msg==null || msg.isEmpty()||msg.trim().isEmpty())
		{
			throw new IllegalArgumentException("msg cant be null or empty");
		}
			System.out.println(msg);
			return msg;
	}
}