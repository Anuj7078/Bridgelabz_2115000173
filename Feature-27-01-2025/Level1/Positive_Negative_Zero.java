import java.util.*;

public class Positive_Negative_Zero{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int n = sc.nextInt();
		int ans = PositiveNegativeZero(n);
		System.out.print("Entered Number is: "+ans);
	}
	public static int PositiveNegativeZero(int n){
		if(n<0)	return -1;
		else if(n>0)	return 1;
		return 0;
	} 
}