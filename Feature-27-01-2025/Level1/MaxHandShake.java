import java.util.*;

public class MaxHandShake{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Students:");
		int n= sc.nextInt();
		int ans = MaximumHandShake(n);
		System.out.print("Maximum Number of HandShake for "+n+"Students are "+ans);
	}
	public static int MaximumHandShake(int n){
		return (n*(n-1))/2;
	} 
}