import java.util.*;

public class ReplaceWordMethod{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sentence: ");
		String st = sc.nextLine();
		System.out.print("Enter Word to Replace: ");
		String replaceWord = sc.nextLine();
		System.out.print("Enter Word to Replace with: ");
		String replaceWithWord = sc.nextLine();
		
		String ans = WordReplaceMethod(st,replaceWord,replaceWithWord);
		System.out.print("Sentence after Word Replace: "+ans);
	}
	public static String WordReplaceMethod(String st, String replaceWord, String replaceWithWord){
		return st.replace(replaceWord, replaceWithWord);
	}
}