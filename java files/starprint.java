import java.util.*;
class starprint
{
	public static void main(String []args)
	{	
		Scanner s1 =new Scanner(System.in);
		int row = s1.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				
				System.out.print("*");
	
			}
			System.out.println();
		}

	}

}