package coreJavaTraining;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

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
		System.out.print("Enter your Birth Year: ");
		int year = sc.nextInt();
		System.out.print("Enter your Birth Day: ");
		int day = sc.nextInt();
		System.out.print("Enter your Birth Month: ");
		int month = sc.nextInt();
		
		LocalDate birthDate =  LocalDate.of(year, month, day);
		LocalDate currentDate = LocalDate.now();
//		int age_mon = cal.get(Calendar.MONTH);
//		int age_year = cal.get(Calendar.YEAR) - year;
//		int age_month = (cal.get(Calendar.MONTH)+1) - month;
//		int age_day = cal.get(Calendar.DATE) - day;
		Period age = Period.between(birthDate, currentDate);
		System.out.printf("Age is %d Years %d Months %d Days", age.getYears(), age.getMonths(), age.getDays());
	}
	
	//Last Day of Current Month
	public void LastDayCurrMon() {
		int last_day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int last_date = cal.getActualMaximum(Calendar.DATE);
		System.out.printf("Last Day of the Current Month is: %d%n",last_day);
		System.out.printf("Last Date of the Month is: %d%n",last_date);
	}
	
	//Write a Java program to count the number of days between two given years
	public void NumberOfDaysBWYears() {
		System.out.print("Enter the First Year: ");
		int year1 = sc.nextInt();
		System.out.print("Enter the Second Year: ");
		int year2 = sc.nextInt();
		int count = 0;
		if(year1 > year2) {
			System.out.print("First Year Cannot be Greater than Second Year");
		}
		else {
		for(int i = year1; i<=year2; i++) {
			cal.set(Calendar.YEAR, i);
			cal.set(Calendar.DAY_OF_YEAR, 1);
			count = count + cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		}
		System.out.printf("The number of days between %d and %d are: %d%n",year1,year2,count);
		}
	}
	
	//Write a Java program to print LocalDate yyyy-MM-dd and LocalTime HH:mm:ss
	public void PrintLocalDate() {
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");		//hh:mm:ss for 12-Hour Format
		String d = df.format(ld);
		String t = tf.format(lt);
		System.out.printf("Local Date is: %s%n", d);
		System.out.printf("Local Time is: %s%n", t);
	}
	
	//Write a Java program to print ZonedDateTime E MMM yyyy HH:mm:ss.SSSZ
	public void PrintZonedDateTime() {
		ZoneId zone1 = ZoneId.of("Australia/Sydney");
		ZonedDateTime zdt = ZonedDateTime.now(zone1);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ");
		String dt = dtf.format(zdt);
		System.out.printf("Zoned Date Time is: %s%n", dt);		
	}

	//Write a Java program to print OffsetTime HH:mm:ss,Z
	public void OffSetTime() {
		LocalTime lt = LocalTime.now();
		ZoneOffset zoneoffset = ZoneOffset.of("+10:00");
		OffsetTime ot = OffsetTime.of(lt, zoneoffset);
		System.out.print(ot);
	}
	
	//Write a Java program to get seconds since 1970
	public void SecondsSince1970() {
		long lt = System.currentTimeMillis()/1000;
		System.out.println("Seconds since 1970 = "+lt);
		
		Date date = new Date(lt*1000L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
		String dt = sdf.format(date);
		System.out.println(dt);
	}
	
	//Write a Java program to extract date, time from the date string
	public void ExtractDateTime() throws ParseException {
		String Date = "05-07-2025 19:47:00";
		Date sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(Date);
		System.out.println(sdf);
		String new_str = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss a").format(sdf);
		System.out.println(new_str);
	}
	
	public static void main(String[] args) throws ParseException {
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
//		c.calAge();
//		c.LastDayCurrMon();
//		c.NumberOfDaysBWYears();
//		c.PrintLocalDate();
//		c.PrintZonedDateTime();
//		c.OffSetTime();
//		c.SecondsSince1970();
		c.ExtractDateTime();

	}

}
