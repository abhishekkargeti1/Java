import java.util.*;
class Account
{
	int bal;
	Account(int b)
	{
		bal=b;
	}	
	boolean isSuffiecent(int w)
	{
		if(bal>w)
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
		System.out.println(g1+" Transcation Successfull");
		System.out.println(g1+" Current Balance" +bal);
		
	}
}
class Customer implements Runnable
{
	Account x1;
	String m1;
	Customer(Account y, String h1)
	{
		x1=y;
		m1=h1;
	}
	public void run()
	{
		Scanner s1 =new Scanner(System.in);
		synchronized(x1)
		{
			System.out.println("Enter Amount" + m1);
			int amt = s1.nextInt();
			if(x1.isSuffiecent(amt))
			{
				x1.withdraw(amt,m1);
			}
			else
			{
			System.out.println("Balance not Available");
			}
		}
	}
}
class ThreadSyn1
{
	public static void main(String []args)
	{
		Account a1 =new Account(5000);
		Customer c1 =new Customer(a1," Abhis");
		Customer c2 =new Customer(a1," Nikhil");
		Thread t1 =new Thread(c1);
		Thread t2 =new Thread(c2);
		t1.start();
		t2.start();
		
	}
}