import java.util.*;

public class Palindrome{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.next();
			
		int i=0,j=st.length()-1;
		boolean isPalindrome = false;
		while(i<=j){
			if(st.charAt(i) != st.charAt(j)){
				isPalindrome = false;
				break;
			}
			isPalindrome = true;
			i++;
			j--;
		}
		if(isPalindrome)	System.out.print("Given String is Palindrome");
		else	System.out.print("Given String is Not Palindrome");
	}
}