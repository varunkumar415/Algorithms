import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date_Calender{

public static void main(String[] args)
{
	//String to Date
	String strDate = "02-01-2018";
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	try
	{
		Date date1 = sdf.parse(strDate);
		
		System.out.println("String to Date :"+date1);
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	//Date to String
	Date date2 = new Date();
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy EEE hh:mm:ss");
	String date2String = sdf2.format(date2);
	System.out.println("Date to String :"+date2String);
	
	//Date to Calender
	Date date3 = new Date();
	Calendar cal = Calendar.getInstance();
	cal.setTime(date3);
	System.out.println("Date to Calender");
	System.out.println(cal.get(Calendar.YEAR));
	System.out.println(cal.get(Calendar.MONTH));
	System.out.println(cal.get(Calendar.DATE));
	System.out.println(cal.get(Calendar.HOUR));
	System.out.println(cal.get(Calendar.MINUTE));
	System.out.println(cal.get(Calendar.SECOND));
	
	//Calender to Date
	System.out.println("Calender to Date");
	Calendar cal2 = new GregorianCalendar(2018,00,02);
	Date date4 = cal2.getTime();
	System.out.println(date3);
	
	
	
}	
	
	
	
}//class