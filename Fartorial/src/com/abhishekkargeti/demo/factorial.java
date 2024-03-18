package com.abhishekkargeti.demo;
import java.util.*;
import java.lang.Math;
class otp
{
	void fun(int length)
	{
		int otp =0;
		String  otp1 =" ";
		for(int i=0; i <=length; i++ )
		{
			otp =(int)((Math.floor(Math.random()*10)));
			otp1 += Integer.toString(otp);
		}
		System.out.println(otp1);
	}
}
public class factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		otp o =new otp();
		o.fun(n);
	}

}
