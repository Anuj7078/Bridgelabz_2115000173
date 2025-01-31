import java.util.*;

public class Palindrome{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            String st = Input("Enter a String: ");
            boolean isPalindrome = checkPalindrome(st);
            if (isPalindrome) System.out.println(st + " is a palindrome.");
			else System.out.println(st + " is not a palindrome.");

            System.out.print("Exit? (Y/N): ");
            String choice = sc.nextLine();
            if (choice.equals("Y")) {
                break;
            }
			else	continue;
        }
    }
    public static String Input(String print) {
        System.out.print(print);
        return sc.nextLine();
    }
    public static boolean checkPalindrome(String str) {
        String St = str.toLowerCase();
        
        int i = 0;
        int j = St.length() - 1;
        
        while (i < j) {
            if (St.charAt(i) != St.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
