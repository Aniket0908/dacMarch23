package date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Date1 {
   public static Date StringToDate(String dob) throws ParseException {
     
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    
      Date date = formatter.parse(dob);
      System.out.println("Date object value: "+date);
      return date;
   }
   public static void main(String args[]) throws ParseException {
      //Reading name and date of birth from the user
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String name = sc.next();
      System.out.println("Enter your date of birth (dd-MM-yyyy): ");
      String dob = sc.next();
      //Converting String to Date
      Date date = Date1.StringToDate(dob);
      System.out.println("Select format: ");
      System.out.println("a: MM-dd-yyyy || b: dd-MM-yyyy || c: yyyy-MM-dd ");
      char ch = sc.next().toCharArray()[0];;
      switch (ch) {
         case 'a':
            System.out.println("Date in the format: MM-dd-yyyy");
            System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(date));
            break;
         case 'b':
            System.out.println("Date in in the format: dd-MM-yyyy");
            System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(date));
            break;
         case 'c':
            System.out.println("Date in the format: yyyy-MM-dd");
            System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
            break;
         default:
            System.out.println("Model not found");
            break;
      }
   }
}
