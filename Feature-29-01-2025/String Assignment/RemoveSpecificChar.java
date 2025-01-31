import java.util.*;

public class RemoveSpecificChar{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		System.out.print("Enter the Character to remove: ");
		char c = sc.next().charAt(0);
		
		StringBuilder ans = new StringBuilder();
		for(char ch : st.toCharArray()){
			if(ch != c)	ans.append(ch);
		}
	
	System.out.print(ans.toString());
		
	}
}