class expection2
{
	public static void main(String []args)
		{
			int cb = 10000;
			int wb = 14000;
			try
			{
				cb=cb-wb;
				if(cb<wb)
				{
					System.out.println("Balance is nort available);
				}	
				
			}
			catch(Expection a1)
			{
				System.out.println("Transcation Complete");
				System.out.println("Cuurent Balance"+bal);
			}
			


		}

}