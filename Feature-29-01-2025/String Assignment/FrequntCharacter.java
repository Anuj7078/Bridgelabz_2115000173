import java.util.*;

public class FrequntCharacter{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		HashMap<Character, Integer> hm = new HashMap<>();
		
		int maxFreq = 0;
		char mostFreqChar = st.charAt(0);
		
		for(char ch : st.toCharArray()){
			hm.put(ch, hm.getOrDefault(ch,0)+1);
			if(hm.get(ch)>maxFreq){
				maxFreq = hm.get(ch);
				mostFreqChar = ch;
			}
		}
		
		System.out.print("Most Frequent Character: "+mostFreqChar);
	}
}