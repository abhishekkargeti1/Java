import java.io.*;
class File2
{
	public static void main(String []args) throws IOException
		{
			FileOutputStream f1= new FileOutputStream("a.txt", true);
				String s1 = "Hel";
				int i;
				char a1[] = s1.toCharArray();
				for(i=0;i<a1.length;i++)
					{	
						f1.write(a1[i]);
					}
				f1.close();
		}

}