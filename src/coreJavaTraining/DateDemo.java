package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		SimpleDateFormat sd1 = new SimpleDateFormat("MM/d/YYYY");
		SimpleDateFormat sd2 = new SimpleDateFormat("MM/d/yyyy HH:mm:ss");
		System.out.println(d.toString());
		System.out.println(sd1.format(d));
		System.out.println(sd2.format(d));

	}

}
