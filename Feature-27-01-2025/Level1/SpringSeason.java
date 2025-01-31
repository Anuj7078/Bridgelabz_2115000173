import java.util.*;

public class SpringSeason{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month:");
		int month = sc.nextInt();
		System.out.print("Enter Days:");
		int days = sc.nextInt();
		boolean ans = SpringSeasonFunc(month,days);
		if(ans)	System.out.print("Its a Spring Season");
		else System.out.print("Not a Spring Season");
	}
	public static boolean SpringSeasonFunc(int month, int days){
		if ((month == 3 && days >= 20) || (month == 6 && days <= 20) || (month > 3 && month < 6)) {
            return true;
        }
        return false;
	} 
}