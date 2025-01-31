import java.util.*;
public class OddOrEven{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            if(i%2==0) System.out.println(i+" is Even");
            else System.out.println(i+" is Odd");
        }
    }
}