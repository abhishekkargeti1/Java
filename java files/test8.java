class test8
{
	public static void main(String []args)
	{
		String s1 =new String("I am Abhishek");
		String s2 =new String("I am Abhishek");
		System.out.println(s1==s2);
		final String s3 ="I am";
		String s4 = s3+ " Abhishek";
		String s5 ="I am " + "Abhishek";
		System.out.println(s5==s4);
		System.out.println(s4);

	}

}