class box1
{
	private int x,y;
	box1(int a ,int b)
	{
		x=a;
		y=b;
		System.out.println(x);
		System.out.println(y);
	}
}
class box2 extends box1
{
	box2()
	{
		super(2,4);
	}

}
class super2
{
	public static void main(String []args)
		{
			box2 a1 =new box2();
		
			
		}
}