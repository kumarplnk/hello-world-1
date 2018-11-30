class HelloWorld
{
	static final String VAL=new String("hello world ");
	public String sayHello(String msg) throws IllegalArgumentException
	{
		if(msg==null || msg.isEmpty()||msg.trim().isEmpty())
		{
			throw new IllegalArgumentException("Argument cant be null or empty");
		}
			String result=VAL.concat(msg);
			System.out.println(result);
			return result;
	}
}