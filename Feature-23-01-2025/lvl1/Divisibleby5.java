import java.util.*;

public class Divisibleby5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n%5==0){
            System.out.println("Given number is divisible by 5");
        }else{
            System.out.println("Given number is not divisible by 5");   
        }
    }
}