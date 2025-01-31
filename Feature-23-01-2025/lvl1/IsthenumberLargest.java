import java.util.*;
public class IsthenumberLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second number: ");
        int b=sc.nextInt();
        System.out.println("Enter third number: ");
        int c=sc.nextInt();
        sc.close();;
        if(a<b){
            if(b>c){
                System.out.println("Is the first number smallest?: No");
                System.out.println("Is the Second number smallest?: Yes");
                System.out.println("Is the Third number smallest?: No");
            }else{
                System.out.println("Is the first number smallest?: No");
                System.out.println("Is the Second number smallest?: No");
                System.out.println("Is the Third number smallest?: Yes");
            }
        }else{
            if(a>c){
                System.out.println("Is the first number smallest?: Yes");
                System.out.println("Is the Second number smallest?: No");
                System.out.println("Is the Third number smallest?: No");
            }else{
                System.out.println("Is the first number smallest?: No");
                System.out.println("Is the Second number smallest?: No");
                System.out.println("Is the Third number smallest?: Yes");
            }
        }
    }
}
