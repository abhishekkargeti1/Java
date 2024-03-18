import java.util.*;
class Account
{
	int bal;
	Account(int b)
		{
			bal=b;
		}
	boolean isbalanceaviable(int w)
		{	
			if(bal>=w)
			{
				return true;
			}
			else
			{
				return false;
			}		
		
		}
	void withdraw(int amt, String g1)
		{
			bal=bal-amt;
			System.out.println(g1 +"Transcation complete");
			System.out.println(g1 +"Current Balnce is :"+bal);
		}	
}
class Customer extends Thread
{
	Account x1;
	String m1;
	Customer(Account j1, String h1)
	{
		x1=j1;
		m1=h1;
	}
	public void run()
	{
		synchronized(x1)
		{		
			Scanner s1 =new Scanner(System.in);
			System.out.println("Enter the Amount:");
			int amt = s1.nextInt();
			if(x1.isbalanceaviable(amt))
			{
				x1.withdraw(amt,m1);

			}
			else
			{
				System.out.println("Balance not available");

			}
		}
	}

}
class ThreadSyn4
{
	public static void main(String []args)
		{
			Account a1 =new Account(5000);
			Customer c1 =new Customer(a1,"abhis");
			Customer c2 =new Customer(a1,"sim");
			c1.start();
			c2.start();
		}


}