import java.util.*;

public class CountVowelsAndConsonant{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.next();
		int vowelsCount = 0;
		int consonantCount = 0;
		for(char ch : st.toCharArray()){
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')	vowelsCount++;
			else consonantCount++;
		}
		
		System.out.println("Vowels count in given String is "+vowelsCount);
		System.out.print("Consonant count in given String is "+consonantCount);
	}
}