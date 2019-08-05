/*  page 226 #10

	8-2-19
	
*/

import java.time.*;

public class DaysTilNextMonth
{
	public static void main(String[] args)
	{
		//var
		int day;
		int daysTilNextMonth;
		
		LocalDate today = LocalDate.now();
		System.out.print("Today is... " + today);
		
		day = today.getDayOfMonth();
		daysTilNextMonth = today.lengthOfMonth() - day ;
		
		System.out.println("There are " + daysTilNextMonth + " days until " + today.plusMonths(1).getMonth() + " starts");
	}
}
