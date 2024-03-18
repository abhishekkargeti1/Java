interface Demo1
{
	int x =5; //final variable ,public ,static
	void fun1(); //public , abstract
	static void fun2()
	{
		//Declare function if it is static
	}

}
class Demo2 implements Demo1
{
	void fun1()
	{
		super.x=x;
	}
	void display()
	{
		System.out.println(super.x);
	}
	
}
class inter
{
	public static void main(String []args)
	{
		Demo2 a1 =new Demo2();
		a1.display();
	}
}