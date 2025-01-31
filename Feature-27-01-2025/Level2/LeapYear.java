import java.util.*;

public class LeapYear{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Year: ");
		int year = sc.nextInt();
		if(LeapYearOrNot(year))	System.out.print(year+" is Leap Year");
		else	System.out.print(year+" is Not Leap Year");
	}
	public static boolean LeapYearOrNot(int year){
		if (year >= 1582) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
        return false;
	}
}