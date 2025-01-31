import java.util.*;

public class QuotientAndRemainder{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd Number:");
		int num2 = sc.nextInt();
		int []ans = findRemainderAndQuotient(num1,num2);
		System.out.println("Quotient is : " + ans[0] + " Remainder is: " + ans[1]);
	}
	public static int[] findRemainderAndQuotient(int num1, int num2) {
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        return new int[] { quotient, remainder };
    } 
}