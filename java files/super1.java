class Example
{
	int x,y;
	void fun1(int p, int q)
	{
		x=p;
		y=q;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}

}
class Example1 extends Example
{
	void fun1(int x, int y)
	{
	super.x=x;
	super.y=y;
	}
	void display()
	{
		System.out.println(super.x);
		System.out.println(super.y);
	}


}
class super1
{
	public static void main(String []args)
	{
		Example1 a1 =new Example1();
		a1.fun1(32,234);
		a1.display();
	}

}