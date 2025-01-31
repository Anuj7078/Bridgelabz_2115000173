import java.util.*;

public class ChoclateDivide{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Chocolates:");
		int choco = sc.nextInt();
		System.out.print("Enter Number of Children:");
		int ch = sc.nextInt();
		int []ans = findRemainderAndQuotient(choco,ch);
		System.out.println("Number of Chocolates Each child gets: " + ans[0] + " chocolates, Remaining chocolates: " + ans[1]);
	}
	public static int[] findRemainderAndQuotient(int choco, int ch) {
        int quotient = choco / ch;
        int remainder = choco % ch;
        return new int[] { quotient, remainder };
    } 
}