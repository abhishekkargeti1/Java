import java.util.*;
class oddeven1
{
	void fun(int x)
	{
		if((x&1)==0)
		{
			System.out.println("The number is even");

		}
		else
		{
			System.out.println("The number is odd");

		}

	}

}
class oddeven
{
	public static void main(String[]args)
	{
		Scanner s1 =new Scanner(System.in);
		int x = s1.nextInt();
		oddeven1 o1 =new oddeven1();
		o1.fun(x);

	}
}