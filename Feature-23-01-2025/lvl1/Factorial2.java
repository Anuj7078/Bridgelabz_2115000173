import java.util.*;
public class Factorial2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        sc.close();
        int factorial = 1;
        for(int i=2;i<=n;i++){
            factorial = factorial * i;
        }
        System.out.print("Factorial of"+n+"is"+factorial);
    }
}