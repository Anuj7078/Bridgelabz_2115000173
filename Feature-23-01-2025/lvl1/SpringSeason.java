import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month: ");
        String month= sc.nextLine();
        System.out.println("Enter Date: ");
        int date = sc.nextInt();
        sc.close();
        if((month.equals("March") || month.equals("June")) && date>=20){
            System.out.println("Its a Spring Season");
        }else{
            System.out.println("Not a Spring Season");
        }
    }
}
