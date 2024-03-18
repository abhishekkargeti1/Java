import java.util.*;
class zeroatlast
{
	public static void main(String []args)
	{
		int temp,nonzeroindex=0;
		int a[] ={1,0,2,0,3};
		for(int index =0;index<a.length;index++)
		{
			if(a[index]!=0)
			{
				temp=a[index];
				a[index]=a[nonzeroindex];
				a[nonzeroindex]=temp;
				nonzeroindex++;
			}
		}
		System.out.println(Arrays.toString(a));
	}


}