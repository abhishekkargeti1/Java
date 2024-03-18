class try
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
class execption 
{
	public static void main(String []args)
		{
			try t1 =new try();
			t1.fun1(5,0);
			finally()
			{
				System.out.println("Hello world");
			}
		}
}