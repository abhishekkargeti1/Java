class Nokia 
{
	private int mic;
	private int cam;
	void setValue()
	{
		mic=2;
		cam=40;
	}
	void display()
	{
		System.out.println(mic);
		System.out.println(cam);
	}
}



class classesandobjects
{
	public static void main(String []arugs)
	{
		Nokia e1 = new Nokia();
		e1.display();
		e1.setValue();	
		e1.display();
	}
}