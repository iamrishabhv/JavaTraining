package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo {
	
	public static final Scanner sc = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();
	
	//Create Date Using Calendar
	public void datefromcalendar() {
//		int date = cal.get(Calendar.DATE);
//		int mon = cal.get(Calendar.MONTH);
//		int year = cal.get(Calendar.YEAR);
//		System.out.printf("%d/%d/%d%n",date,mon,year);
		System.out.println(cal.getTime());
	}
	
	//Check Leap Year
	public void LeapYear() {
		System.out.print("Enter the Year: ");
		int year = sc.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("Leap Year");
				}
		else {
			System.out.println("Not a Leap Year");
		}
	}
	
	//Leap Year Printer
	public void LeapYearPrinter() {
		System.out.print("Till what year, Year's to be Printed?");
		int yearUntil = sc.nextInt();
		for(int i = 1600; i<= yearUntil; i++) {
			if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
				System.out.println(i);
				}
		}
	}
	
	//Calculate Age
	public void calAge() {
		int year = 1995;
		int day = 21;
		int month = 6;
		int age_year = cal.get(Calendar.YEAR) - year;
		int age_month = cal.get(Calendar.MONTH) - month;
		int age_day = cal.get(Calendar.DATE) - day;
		System.out.printf("Age is %d Years %d Months %d Days", age_year, age_month, age_day);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Calendar cal = Calendar.getInstance();
//		SimpleDateFormat sd2 = new SimpleDateFormat("MM/d/yyyy HH:mm:ss");
//		System.out.println(sd2.format(cal.getTime()));
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//		System.out.println(cal.get(Calendar.AM_PM));
		CalendarDemo c = new CalendarDemo();
//		c.datefromcalendar();
//		c.LeapYear();
//		c.LeapYearPrinter();
		c.calAge();

	}

}
