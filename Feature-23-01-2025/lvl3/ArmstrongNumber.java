package lvl3;
import java.util.*;
class ArmstrongNUmber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        sc.close();
        int temp=n;
        int sum=0;
        while(temp!=0){
            int digit = temp % 10;
            digit = digit * digit * digit;
            sum+=digit;
            temp/=10;
        }
        if(sum==n){
            System.out.println("Given number is ArmStrong");
        }else{
            System.out.println("Given number is not Armstrong");
        }
    }
}