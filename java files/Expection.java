class Example
{
	int x,y,z;
	void setValue(int p,int q)
	{
		x=p;
		y=q;
	}
	void fun1()
	{
		z=x/y;
		System.out.println(z);	
	}
}
class Expection
{
	public static void main(String []args)
		{
			Example a1 =new Example();
				a1.setValue(5,0);
				try
				{	
					a1.fun1();
				}
				catch(Exception t1)
				{
					System.out.println(t1.getMessage());
				}	
			System.out.println("hello World");		
					
		}
}