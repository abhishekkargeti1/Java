class test37
{
	public static void main(String []args)
	{
		StringBuffer sb = new StringBuffer("Abhishek");
		System.out.println(sb.charAt(3));
		System.out.println(sb.charAt(30)); // Exception comes here name StringIndexoutofBounds.

	}

}