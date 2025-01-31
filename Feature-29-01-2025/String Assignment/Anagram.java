import java.util.*;

public class Anagram{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String: ");
		String st1 = sc.nextLine();
		System.out.print("Enter 2nd String: ");
		String st2 = sc.nextLine();
		
		if(anagramOrNot(st1,st2))	System.out.print("Both Strings are Anagram");
		else	System.out.print("Both Strings are Not Anagram");
	}
	public static boolean anagramOrNot(String st1, String st2){
		HashSet<Character> hs = new HashSet<>();
		for(char ch : st1.toCharArray())	if(!hs.contains(ch))	hs.add(ch);
		
		for(char ch : st2.toCharArray())	if(!hs.contains(ch))	return false;
		
		return true;
	}
}