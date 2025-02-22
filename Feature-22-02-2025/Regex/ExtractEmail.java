import java.util.regex.*;
public class ExtractEmail{
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        Pattern pattern = Pattern.compile("[\\w.]+@[\\w.]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}