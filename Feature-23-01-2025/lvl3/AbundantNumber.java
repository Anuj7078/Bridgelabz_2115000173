package lvl3;

import java.util.*;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum>n){
            System.out.println("Given Number is Abundant Number");
        }else{
            System.out.println("Given Number is not a Abundant Number");
        }
    }
}
