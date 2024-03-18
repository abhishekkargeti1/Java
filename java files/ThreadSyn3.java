import java.util.*;
class Account
{
	int bal;
	Account(int b)
	{
		bal=b;
	}
	boolean isbalavailable(int w)
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
			bal =bal-amt;
			System.out.println(g1 + " Transcation Complete .");
			System.out.println("Current balance" +bal);	

		}
	
}
class Customer implements Runnable
{
	String m1;
	Account x1;
	Customer(Account x2 , String h1)
	{
		x1=x2;
		m1=h1;
		
	}	
	public void run()
	{
		synchronized(x1)
		{
			Scanner s1 =new Scanner(System.in);
			System.out.println("Enter Amount: ");
			int amt = s1.nextInt();
			if(x1.isbalavailable(amt))
			{
				x1.withdraw(amt,m1);
			}
			else
			{
				System.out.println("Balance not present");
			}

		}

	}
}
class ThreadSyn3
{
	public static void main(String []args)
		{
			Account a1 =new Account(5000);
			Customer c1 =new Customer(a1 ," abhi");
			Customer c2 =new Customer(a1 ," sim");
			Thread t1 =new Thread(c1);
			Thread t2 =new Thread(c2);
			t1.start();
			t2.start();
		}
}