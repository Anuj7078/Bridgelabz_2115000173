import java.util.*;
public class SumtilZero{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num == 0)    break;
            sum += num;
        }
        sc.close();
        System.out.println("The sum of the numbers is "+sum);
    }
}