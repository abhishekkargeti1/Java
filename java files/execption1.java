class try1
{
	int x,y,z;
	void fun1(int q , int p)
	{
		x=q;
		y=p;
		z=x/y;
		System.out.println(x);
		System.out.println(y);		
	}

}
class execption1
{
	public static void main(String []args)
		{
			try1 t1 =new try1();
			try
			{	
				t1.fun1(5,0);
			}
			catch(Exception a1)
			{
				System.out.println("System Error");
			}	
			finally
			{
				System.out.println("Hello world");
			}
		}
}