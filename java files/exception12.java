class exception12
{
	public static void main(String []args)
	{
		int cb= 10000;
		int wb= 14000;
		try
		{
			if(cb<wb)
			{
				throw new Exception("Balance is not available");
				
			}
			System.out.println("Trancation done");
			System.out.println("Current balnace"+cb);
		
		} 
		catch(Exception a1)
		{
			System.out.println(a1.getMessage());
			System.out.println("Current balnace"+cb);

		}	

	}
}