import java.util.*;
class vowelandconsonet
{
	public static void main(String []args)
	{
		boolean found =false;
		char Uppercasevowel[] ={'A','E','I','O','U'};
		char Lowercasevowel [] ={'a','e','i','o','u'};
		char n;
		Scanner s1 =new Scanner(System.in);
		n=s1.next().charAt(0);
		for(int i=0; i<5;i++)
		{
			if(Uppercasevowel[i] == n  || Lowercasevowel[i] == n)
			{

				System.out.println("It is  vowel");
				found = true;
				break;
			}	
		
		}
		if(!found)
		{
			System.out.println("It is cosonant");
		}
	}

}