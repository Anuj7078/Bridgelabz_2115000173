import java.util.*;

public class ToggleCase{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		StringBuilder ansSt = new StringBuilder();
		for(char ch : st.toCharArray()){
			if(Character.isLowerCase(ch))	ansSt.append(Character.toUpperCase(ch));	
			else if(Character.isUpperCase(ch))	ansSt.append(Character.toLowerCase(ch));
			else ansSt.append(ch);
		}
		
		System.out.print("Toggled String is: "+ansSt.toString());
	}
}