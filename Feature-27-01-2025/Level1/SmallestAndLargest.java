import java.util.*;

public class SmallestAndLargest{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd Number:");
		int num2 = sc.nextInt();
		System.out.print("Enter 3rd Number:");
		int num3 = sc.nextInt();
		int []ans = findSmallestAndLargest(num1,num2,num3);
		System.out.print("Smallest Number among Three is "+ans[0]+" and Largest is "+ans[1]);
	}
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int s = Math.min(number1, Math.min(number2, number3));
        int l = Math.max(number1, Math.max(number2, number3));
        return new int[] { s, l };
	} 
}