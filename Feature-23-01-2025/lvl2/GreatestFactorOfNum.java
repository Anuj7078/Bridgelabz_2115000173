import java.util.*;
public class GreatestFactorOfNum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        int greatestFactor = 1;
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor besides itself: " + greatestFactor);
    }
}