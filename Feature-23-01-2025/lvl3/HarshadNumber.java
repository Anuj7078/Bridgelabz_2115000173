package lvl3;

import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        sc.close();
        int sum=0;
        int temp=n;
        while(temp!=0){
            int digit = temp % 10;
            sum+= digit;
            temp/=10;
        }
        if(n%sum==0){
            System.out.println("Given Number is Harshad Number");
        }else{
            System.out.println("Given Number is not a Harshad Number");
        }
    }
}
