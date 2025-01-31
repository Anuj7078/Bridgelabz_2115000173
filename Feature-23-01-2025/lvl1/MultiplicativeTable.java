import java.util.*;

public class MultiplicativeTable{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        for(int i=6;i<=9;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}