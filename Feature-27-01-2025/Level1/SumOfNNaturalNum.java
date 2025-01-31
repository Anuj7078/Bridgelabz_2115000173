import java.util.*;

public class SumOfNNaturalNum{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int n = sc.nextInt();
		int ans = SumOfNaturalNum(n);
		System.out.print("Sum of "+n+" Natural Number is "+ans);
	}
	public static int SumOfNaturalNum(int n){
		int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
	} 
}