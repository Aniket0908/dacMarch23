package Q9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConvert {
		int day;
		int month;
		int year;
		public DateConvert(int day,int month,int year) {
			this.day=day;
			this.month=month;
			this.year=year;
			
		}
		
		@Override
		public String toString() {
			return this.day+"/"+this.month+"/"+this.year;
		}

		public void getNextDay(String dob) throws ParseException {
			Calendar cd = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse(dob);
			cd.setTime(date);
			 cd.add(Calendar.DATE, 1);
			 Date date1 = cd.getTime();
			 System.out.println(date1);
		}
		public void getPreviousDay(String dob) throws ParseException {
			Calendar cd = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse(dob);
			cd.setTime(date);
			 cd.add(Calendar.DATE, -1);
			 Date date1 = cd.getTime();
			 System.out.println(date1);
		}
		
		
	
		public static void main(String[] args) throws ParseException {
			
			
			DateConvert dc = new DateConvert(12,07,2002);
			System.out.println(dc.toString());
			dc.getNextDay(dc.toString());
			dc.getPreviousDay(dc.toString());
			
			
			
			
		}
}
