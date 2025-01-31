import java.util.*;
public class DecrementCounter2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int counter = sc.nextInt();
        sc.close();
        for(int i=counter;i>1;i--){
            System.out.println((i));
        }
    }
}
