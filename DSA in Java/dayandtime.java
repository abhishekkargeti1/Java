import java.util.*;
class calendar
{
	String dayandtime(int day,int month,int year)
	{
		Calendar obj=Calendar.getInstance();
		obj.set(year,month-1,day);
		String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
		int dayOfWeek = obj.get(Calendar.DAY_OF_WEEK) -1;
		// int hourOfDay = obj.get(Calendar.HOUR_OF_DAY);	
		 // int minuteOfHour = obj.get(Calendar.MINUTE);
	         // int secondOfMinute = obj.get(Calendar.SECOND);
		 // System.out.println(hourOfDay+" : "+minuteOfHour+" : "+secondOfMinute);
        	return days[dayOfWeek];
	}


}
class dayandtime
{
	public static void main(String []args)
	{
		Scanner s1 = new Scanner(System.in);
		int date= s1.nextInt();
		int month=s1.nextInt();
		int year=s1.nextInt();
		calendar c1 =new calendar();
		String dayOfWeek = c1.dayandtime(date,month,year);
		System.out.println(dayOfWeek); 
	}

}