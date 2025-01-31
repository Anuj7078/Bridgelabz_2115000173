import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat{
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        String formatDate1 = currentDate.format(format1);
        String formatDate2 = currentDate.format(format2);
        String formatDate3 = currentDate.format(format3);

        System.out.println("Current date in dd/MM/yyyy format: " + formatDate1);
        System.out.println("Current date in yyyy-MM-dd format: " + formatDate2);
        System.out.println("Current date in EEE, MMM dd, yyyy format: " + formatDate3);
    }
}
