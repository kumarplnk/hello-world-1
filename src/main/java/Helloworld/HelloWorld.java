class HelloWorld
{
	static String val="hello world ";
	public String sayHello(String msg) throws IllegalArgumentException
	{
		if(msg==null || msg.isEmpty()||msg.trim().isEmpty())
		{
			throw new IllegalArgumentException("Argument cant be null or empty");
		}
			val+=msg;
			System.out.println(val);
			return val;
	}
}