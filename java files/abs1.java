abstract class Demo1
{
	int x,y;
	void fun1()
	{
		int x =3;
	}
	abstract void fun2();
Demo1()
{
	System.out.println("I am the parent constructor");
}
}
class Demo2 extends Demo1
{
	int z;
	void fun2()
	{
		y=10;
	}
	void display()
	{
		System.out.println(y);
	}
Demo2()
{
	System.out.println("I am the Child Constructor");
}
	
}

class abs1
{
	public static void main(String []args)
	{
		Demo2 a1 =new Demo2();
		a1.fun2();
		a1.display();

	}	
}