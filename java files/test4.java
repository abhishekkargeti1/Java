class test4
{
	public static void main(String []args)
	{
		StringBuffer sb1 =new StringBuffer("Abhishek");
		StringBuffer sb2 =new StringBuffer("Abhishek");
		String s = new String(sb1);
		System.out.println(s);
		System.out.println(sb1 == sb2); //false
		System.out.println(sb1.equals(sb2)); // false because here the (.equals) is not overridden it work as a refernce object comparison. 

	}

}