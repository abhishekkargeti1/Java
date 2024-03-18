class Example
{
	private int x,y;
	void fun1(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
}



class thisK
{
	public static void main(String []args)
	{
		Example a1 =new Example();
		a1.fun1(33,66 );
		a1.display();	
	}
}