import java.util.*;
public class IstheNumberSmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second number: ");
        int b=sc.nextInt();
        System.out.println("Enter third number: ");
        int c=sc.nextInt();
        sc.close();;
        if(a<b && a<c){
            System.out.println("Is the first number smallest?: Yes");
        }else{
            System.out.println("Is the first number smallest?: No");
        }
    }
}
