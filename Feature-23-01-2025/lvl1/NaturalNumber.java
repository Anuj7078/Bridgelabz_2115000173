import java.util.*;
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n<=0){
            System.out.println("The number "+n+" is not a natural number");
        }else{
            System.out.println("The sum of "+n+" natural number is "+(n*(n+1))/2);
        }
    }
}
