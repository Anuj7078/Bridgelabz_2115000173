import java.util.*;
public class FactorsOfaNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factors are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}