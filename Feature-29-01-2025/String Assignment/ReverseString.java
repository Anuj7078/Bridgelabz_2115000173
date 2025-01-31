import java.util.*;

public class ReverseString{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.next();
		char []stArray = st.toCharArray();
			
		int i=0,j=stArray.length-1;
		while(i<j){
			char temp = stArray[i];
			stArray[i] = stArray[j];
			stArray[j] = temp;
			
			i++;
			j--;
		}
		
		String ans = "";
		for(char ch : stArray)	ans = ans + ch;
		System.out.print("Reversed String is: "+ans);

	}
}