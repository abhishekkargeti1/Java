import java.util.*;
class Amount
{
	int bal;
	Amount(int b)
	{
		bal=b;
	}

	boolean inSufficientBal(int w)
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

	void withdraw(int amt , String g1)
	{	
		bal=bal-amt;
		System.out.println(g1+" Transaction Successfull.");
		System.out.println(g1+" Current Balance is ." +bal);


	}
}
class customer implements Runnable
{
	String m1;
	Amount x1;
	customer(Amount j1,String h1)
	{
		x1=j1;
		m1=h1;
	}
	public void run()
	{
		Scanner s1 =new Scanner(System.in);
		synchronized(x1)
		{
			System.out.println("Enter the Amount "+m1);
			int amt =s1.nextInt();
			if(x1.inSufficientBal(amt))
			{
				x1.withdraw(amt,m1);
			}
			else
			{
			System.out.println("Insufficient Balance");
			}
		}
	}
}
class ThreadSyn
{
	public static void main(String []args)
	{
		Amount a1= new Amount(5000);
		customer c1= new customer(a1,"amit");
		customer c2= new customer(a1,"sumit");
		Thread t1 =new Thread(c1);
		Thread t2 =new Thread(c2);
		t1.start();
		t2.start();
	}	



}

