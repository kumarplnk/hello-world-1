class HelloWorld
{
	static String VAL="hello world ";
	public String sayHello(String msg) throws IllegalArgumentException
	{
		if(msg==null || msg.isEmpty()||msg.trim().isEmpty())
		{
			throw new IllegalArgumentException("Argument cant be null or empty");
		}
			VAL+=msg;
			System.out.println(VAL);
			return VAL;
	}
}