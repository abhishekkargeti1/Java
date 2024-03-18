import java.util.*;
class Arraydeleteelement
{
	public static void main(String []args)
	{
		boolean found =false;
		int a [] ={1,2,3,4,5,6};
		Scanner s1 =new Scanner(System.in);
		int deletethiselement = s1.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==deletethiselement)
			{
				for(int j =i;j<a.length-1;j++)
				{ 
		
					a[j]=a[j+1];
					
				}
				found=true;
				break;
			}

		}
		 a= Arrays.copyOf(a,a.length-1);

		if(found)
		{
			System.out.println(Arrays.toString(a));
		
		}
		else
		{
			System.out.println("Number not found");
		
		}
	}

}
