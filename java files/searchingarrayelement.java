import java.util.*;
class searchingarrayelement
{
	public static void main(String []args)
	{
		// int[] a = new int[10];
		int a[] ={1,2,3,6,5,4,7,9,0,2};
		boolean found =false;
		Scanner s1=new Scanner(System.in);
		int n= s1.nextInt();
		for(int i=0;i<n;i++)
		{
			 // System.out.println(i);
			if(a[i]==n)
			{
				System.out.println("The number is found "+a[i]);
				found =true;
				break;
			}
			

		}
		if(!found)
		{
			System.out.println("The number is not found in array");

		}

	}
}