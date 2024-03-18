import java.util.*;
class Tocheckarrayindex
{
	public static void main(String []args)
	{
	Scanner s1=new Scanner(System.in);
	int n= s1.nextInt();
	int a[]={1,2,3,4,5,6};
	for(int i=0;i<=5;i++)
	{
		if(i%2==0)
		{
			System.out.print(a[i]*2+"  ");

		}
		else
		{
			System.out.print(a[i]*3+"  ");

		}

	}

	}

}