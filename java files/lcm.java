import java.util.*;
class operation
{
	int a,b,x;
	void fun(int a , int b)
	{
	this.a=a;
	this.b=b;
         x=a>b ? a : b;
        do
        {
        	if(x % a==0 && x % b==0)
     		{
       			System.out.println(x);
      			break;
    		}
    		else
    		{
      			++x;
    		}
 	}while(true);
	}
}
class lcm
{
	public static void main(String []args)
	{
		Scanner s =new Scanner(System.in);
		String a =s.next();
		String b =s.next();
		int a1 =Integer.parseInt(a);
		int b1 =Integer.parseInt(b);
		operation op =new operation();
		op.fun(a1,b1);
	}
}