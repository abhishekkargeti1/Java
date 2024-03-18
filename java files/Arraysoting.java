import java.util.*;
class Arraysoting
{
	public static void main(String []args)
	{
		Integer a[]={0,8,9,4,9};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}
}