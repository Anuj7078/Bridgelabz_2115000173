import java.util.*;

public class RemoveDuplicates{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.next();
		HashSet<Character> hs = new HashSet<>();
		String ans = "";
		for(char ch : st.toCharArray()){
			if(!hs.contains(ch))	ans = ans + ch;
			hs.add(ch);
		}
		System.out.print("String after Duplicate Removed: "+ans);
	}
}