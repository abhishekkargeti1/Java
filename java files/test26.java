class test26
{
	private int i;
 	test26(int i)
	{
		this.i=i;

	}
	public test26 modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return new test26(i);
			
		}

	}

	public static void main(String []args)
	{
		test26 t1 =new test26(100);
		test26 t2 = t1.modify(200);
		test26 t3 = t1.modify(100);
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
		

	}

}