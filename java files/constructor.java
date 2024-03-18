class demo 
{
	 int x,y;

demo(int q, int p)
{
	x=p;
	y=q;
}
}
class constructor
{
	public static void main(String []args)
	{
		demo a=new demo(5,9);
		System.out.println(a.x);
		System.out.println(a.y);
	}

}