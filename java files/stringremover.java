import java.util.Arrays;
class stringremover
{
	public static void main(String []args)
	{
		String [] str = {"Abhishek"};
		// System.out.println(str.length);
		for(int i=0;i<str.length;i++)
		{
			str[i]=str[i].replaceAll("[aeiouAEIOU]","");

		}
		System.out.println(Arrays.toString(str));
	}
}