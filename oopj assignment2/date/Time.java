package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Time {
		public static Date StringToTime(String dob) throws ParseException {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			Date date =sdf.parse(dob);
			return date;
		}
		public static void main(String[] args) throws ParseException {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the time:");
			Date date = Time.StringToTime(sc.next());
			System.out.println("Select format: ");
			System.out.println("1.HH:mm:ss");
			System.out.println("2.hh:mm:ss aa");
			System.out.println("3.HH:mm");
			int choice=sc.nextInt();
			switch (choice) {
			case 1: System.out.println("Date in the format: HH:mm:ss");
					System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
				
				break;
			case 2: System.out.println("Date in in the format: hh:mm:ss aa");
            		System.out.println(new SimpleDateFormat("hh:mm:ss aa").format(date));
				
				break;
			case 3: System.out.println("Date in the format: HH:mm");
            		System.out.println(new SimpleDateFormat("HH:mm").format(date));
				
				break;

			default:	System.out.println("Model not Found");
				break;
			}
		}
}
