import java.util.*;

public class NumberOfRoundsNeeded{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Side 1 in Meters:");
		int s1 = sc.nextInt();
		System.out.print("Enter Side 2 in Meters:");
		int s2 = sc.nextInt();
		System.out.print("Enter Side 3 in Meters:");
		int s3 = sc.nextInt();
		int ans = RoundsNeeded(s1,s2,s3);
		System.out.print("Athlete needs "+ans+" Rounds to Complete 5km with sides "+s1+", "+s2+", "+s3);
	}
	public static int RoundsNeeded(int s1, int s2, int s3){
		return (5000/(s1+s2+s3));
	} 
}