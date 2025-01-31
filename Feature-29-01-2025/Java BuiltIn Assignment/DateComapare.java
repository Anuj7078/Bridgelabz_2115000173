import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateCompare{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String date1 = sc.nextLine();
        LocalDate firstDate = LocalDate.parse(date1, formatter);

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String date2 = sc.nextLine();
        LocalDate secondDate = LocalDate.parse(date2, formatter);

        compareDates(firstDate, secondDate);
    }

    public static void compareDates(LocalDate firstDate, LocalDate secondDate) {
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The two dates are the same.");
        }
    }
}
