package getScreenShots;

import java.util.Date;

public class FetchTodayDate 
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println("Actual format"+d);
		String d1 = d.toString();
		System.out.println("now converted to string format"+d1);
		String d2 = d1.replaceAll(":","-");
		System.out.println("final product"+d2);
	}
}
