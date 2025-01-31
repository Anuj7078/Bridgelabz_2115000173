import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String Date = sc.nextLine();
        LocalDate date = LocalDate.parse(Date, formatter);
        
        LocalDate newDate = date.plusDays(7)
                                .plusMonths(1)
                                .plusYears(2);
        
        newDate = newDate.minusWeeks(3);
        
        System.out.println("Original date: " + date);
        System.out.println("New date: " + newDate);
    }
}
