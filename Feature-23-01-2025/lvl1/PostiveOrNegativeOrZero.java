import java.util.*;
public class PostiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n==0){
            System.out.println("Zero");
        }else if(n>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
