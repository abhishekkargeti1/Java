class expection2
{
	public static void main(String []args)
		{
			int cb = 10000;
			int wb = 14000;
			try
			{
				
				if(cb<wb)
				{
					throw new Exception ("Balance is not available");
				}	
				
			
			cb=cb-wb;
			System.out.println("Transcation Complete");
			}			
			catch(Exception a1)
			{
				System.out.println(a1.getMessage());
				System.out.println("Cuurent Balance"+cb);
			}
			


		}

}