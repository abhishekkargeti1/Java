import java.util.*;
class test29
{
	public static void main(String []args)
	{
		int n,f=1;
		System.out.println("Enter any number");
		Scanner s1 =new Scanner(System.in);
		n = s1.nextInt();
		for(int i=0; i<n; i++)
		{
			f = f*(n-i);
		}
		System.out.println(f);
	}
}