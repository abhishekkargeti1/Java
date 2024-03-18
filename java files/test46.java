class test46
{
	public static void main(String []args)
	{
		StringBuffer sb =new StringBuffer(1000);
		sb.append("ABC");
		System.out.println(sb.capacity()); // 1000
		sb.trimToSize(); // to dellocate an use memory according to the character size.
		System.out.println(sb.capacity()); // 3


	}

}