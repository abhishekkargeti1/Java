class test3
{
	public static void main(String []args)
	{
		String s1 =new String("Abhishek");
		String s2 =new String("Abhishek");
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true because here (.equals) overridden and now it compair the characters.

	}


}