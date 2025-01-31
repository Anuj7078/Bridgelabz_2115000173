import java.util.*;
public class DecrementCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int counter = sc.nextInt();
        sc.close();
        while(counter>1){
            System.out.println(counter);
            counter--;
        }
    }
}
