class test25
{
	public static void main(String []args)
	{
		String s1 =new String("abhishek");
		String  s2 = s1.toString();
		String s3 = s1.toUpperCase(); // Heap ABHISHEK
		String s4 = s1.toLowerCase(); // Heap abhishek
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);

	}

}