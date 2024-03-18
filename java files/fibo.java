import java.util.*;
class fibo1
{
	int a=0,b=1;
	int c;
	int fun(int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n==1)
		{
			return 2;
		}
	
	for(int i =0; i<=n-2; i++)
	{
		c=a+b;
		a=b;
		b=c;
	}
		System.out.println(c);
		return c;
	}
}
class fibo
{
	public static void main(String []args)
	{
		Scanner s1 =new Scanner(System.in);
		int n = s1.nextInt();
		fibo1 f1=new fibo1();
		f1.fun(n);
	}
}