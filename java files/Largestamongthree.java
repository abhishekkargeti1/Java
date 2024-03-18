import java.util.*;
class Largestamongthree
{
	public static void main(String []args)
	{
		Scanner s1 =new Scanner(System.in);
		int a =s1.nextInt();
		int b =s1.nextInt();
		int c= s1.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is largest");

		}			
		else if(b>a && b>c)
		{
			System.out.println("B is largest");
		}
		else
		{
			System.out.println("C is largest");

		}
	}	
}