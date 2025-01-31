import java.util.*;

public class SumOfNaturalNum{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n = sc.nextInt();
		int recursiveSum = RecursiveSum(n);
		int formulaSum = FormulaSum(n);
		
		if (recursiveSum == formulaSum) System.out.println("The results match!");
        else System.out.println("The results do not match.");
	}
	public static int RecursiveSum(int n) {
        if (n == 1) return 1;
        return n + RecursiveSum(n - 1);
    }

    public static int FormulaSum(int n) {
        return n * (n + 1) / 2;
    }
}