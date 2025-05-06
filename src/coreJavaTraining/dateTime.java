// Write a Java program to print the current date and time in the specified format.

package coreJavaTraining;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class dateTime {
	
	//Write a Java program to create a Date object using the Calendar class.
	public void calendarClass() {
		int year = 2025;	// YYYY
		int month = 4;		// Month: 0-11
		int date = 31;		// Date : 1-31
		Calendar ca = Calendar.getInstance();
		ca.set(Calendar.YEAR,year);
		ca.set(Calendar.MONTH,month);
		ca.set(Calendar.DATE,date);
		System.out.println(ca.getTime());
	}
	
	//Write a Java program to get the current time in New York.
	public void timeZone() {
		ZoneId zi = ZoneId.of("America/New_York");		//This class is used to get the Time Zone ID for a particular Time Zone
		LocalDateTime now = LocalDateTime.now(zi);		//This class fetches the local date time.
		System.out.println(now);
	}
	
	//Write a Java program to check if a year is a leap year or not.
	public void leapYear() {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if((y%4==0 && y%100!=0) || y%400==0) {
			System.out.println("This is a Leap Year");
		}
		else{
			System.out.println("This is NOT a Leap Year");
		}
	}
	
	//Program to Display Date Time in a Format
	public void dateFormat() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//		DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("H:mm:ss");
		
		System.out.println("Current Date and Time :\n");
		System.out.println(now.format(dateformat));
		System.out.println(now.format(timeformat));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dateTime dt = new dateTime();
		dateTime tz = new dateTime();
		dateTime ly = new dateTime();
		dateTime df = new dateTime();
		dt.calendarClass();
		tz.timeZone();
		ly.leapYear();
		df.dateFormat();
	}

}
