import java.lang.Math;
class otp1
{
	void otp(int q)
	{	
		int length;
		int otp =0;
		String otps="";
		length =q;
		for(int i=0;i<length;i++)
		{
			otp =(int)((Math.floor(Math.random()*10)));
			otps += Integer.toString(otp);
			
		}
			System.out.println(otps);	
			
		
		
	}
}
public class test28 {

	public static void main(String[] args) {
		otp1 o =new otp1();
		o.otp(9);
	}
}