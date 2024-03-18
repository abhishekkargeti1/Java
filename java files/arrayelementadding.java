class arrayelementadding1
{	int sum=0;
	 int n=5;
	int x[] ={1,2,3,4,5};
	void fun()
	{
		for(int i=0;i<n;i++)
		{

			sum += x[i];	
	
		}
		System.out.println(sum);

	}
}
class arrayelementadding
{
	public static void main(String []args)
	{
		
		arrayelementadding1 a1= new arrayelementadding1();
		a1.fun();
	}	
}