import java.util.*;
class test22
{
	public static void main(String []args)
	{
		Scanner s =new Scanner(System.in);
		String name =s.nextLine().toLowerCase().trim(); // to read the line 
		if(name.equals("hydrabad"))
		{
			System.out.println("Hydrabad is the city");
		}
		else if(name.equals("delhi"))
		{
			System.out.println("Delhi is the city");

		}
		else if(name.equals("mumbai"))
		{
			System.out.println("Mumbai is the city");

		}
		else
		{
			System.out.println("Please enter valid city name");

		}
	}

}