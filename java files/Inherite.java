class Nokia1
{
	int x,y;
	void fun1()
	{
		System.out.println("I am the Parent");
	}
Nokia1()
{
	System.out.println("I am constructor of Nokia 1");
}
}

class Nokia2 extends Nokia1
{
	void fun2()
	{
		System.out.println("I am the child");
	}
Nokia2()
{
	System.out.println("I am constructor of Nokia 2");
}
}


class Inherite 
{
	public static void main(String []args)
	{
		Nokia2 a1=new Nokia2();
		 
	}
	 
}