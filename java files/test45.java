class test45
{
	public static void main(String []args)
	{
		StringBuffer sb =new StringBuffer();
		sb.ensureCapacity(1000); // to increase the capacity dyanamically we use this method.
		System.out.println(sb.capacity());

	}

}