class test35
{
	public static void main(String []args)
	{
		StringBuffer sb =new StringBuffer();
		StringBuffer sb2 =new StringBuffer(1000); // to create a  large Stringbuffer in starting 
		System.out.println(sb2.capacity());
		System.out.println(sb.capacity()); // to check capacity of the StringBuffer.
		sb.append("abcdfgghhjjjjytr");
		System.out.println(sb.capacity()); 
		sb.append("abcdfgghhjjjjytrree");
		System.out.println(sb.capacity());
	}

}