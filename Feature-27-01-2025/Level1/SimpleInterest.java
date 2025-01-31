import java.util.*;

public class SimpleInterest{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle Amt:");
		int p = sc.nextInt();
		System.out.print("Enter Time Period:");
		int t = sc.nextInt();
		System.out.print("Enter Interest Rate:");
		int r = sc.nextInt();
		SimpleInterestFunc(p,r,t);
	} 
	public static void SimpleInterestFunc(int p, int r, int t){
		System.out.println("The Simple Interest is "+((p*r*t)/100)+" for Principal "+p+", Rate of Interest "+r+" and Time "+t+"___");
	} 
}