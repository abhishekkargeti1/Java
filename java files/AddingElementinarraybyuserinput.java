import java.util.*;
class AddingElementinarraybyuserinput
{
	public static void main(String []args)
	{
		int a[] ={1,2,3,4,5};
		Scanner s1 =new Scanner(System.in);
		int newelement = s1.nextInt();
		int position =s1.nextInt();
		int a1[]= new int[a.length+1];
		for(int i=0;i<position;i++)
		{
			a1[i]=a[i];
		}
		a1[position] =  newelement;
	for (int i = position + 1; i < a1.length; i++) {
            a1[i] = a[i - 1];
        }

       System.out.println(Arrays.toString(a1));

	}

}
