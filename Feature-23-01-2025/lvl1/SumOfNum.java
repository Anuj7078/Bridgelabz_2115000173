import java.util.*;
public class SumOfNum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        int sumFormula = n*(n+1)/2;
        if(sum == sumFormula) System.out.print("Sum is same for both technique");
        else System.out.print("Sum is not same for both technique");
    }
}