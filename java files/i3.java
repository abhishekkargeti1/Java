interface i1
{
	int x=6; //Final variable , static, public
	int y=10;
	void fun1(); // public , abstract
	static void fun3()
	{
		System.out.println(x);
		System.out.println(y);
	}
}
interface i2 extends i1
{
	static void fun4()
	{
	int z =22;
	int c =66;
	System.out.println(z);
	System.out.println(c);
	}
	
}
class i3 
{
	public static void main(String []args)
	{ 
		i1.fun3();
		i2.fun4();
		
	}
}