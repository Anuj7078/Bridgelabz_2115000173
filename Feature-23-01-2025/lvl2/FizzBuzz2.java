import java.util.*;
public class FizzBuzz2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num:");
        int n = sc.nextInt();
        sc.close();
        if(n<=0){
            System.out.print("Please Enter Positive Num");
        }else{
            int i = 1;
        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
        }
    }
}