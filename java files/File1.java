import java.io.*;
class File1
{
	public static void main(String []args) throws IOException
		{
			File f1 =new File("a.text");
			f1.createNewFile();
			System.out.println(f1.exists());
			System.out.println(f1.canWrite());
			System.out.println(f1.length());
		}

}