import java.util.*;

public class LongestWordInSentence{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sentence: ");
		String sentence = sc.nextLine();
		String []Words = sentence.split(" ");
		String LongestWord = "";
		for(String word : Words)	if(word.length() >= LongestWord.length())	LongestWord = word;
		
		System.out.print("Longest Word in the Sentence is: "+LongestWord);
		
	}
}