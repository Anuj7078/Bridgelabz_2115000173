import java.util.*;
public class SubStringOccurence{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = sc.nextLine();
		System.out.print("Enter the SubString: ");
		String subst = sc.nextLine();
		
		if(subst == null || st == null ||subst.isEmpty() || st.length() < subst.length())
			System.out.print("Enter a Valid String or SubString");
		
		int count = 0;
		int n = st.length();
		int m = subst.length();
		
		for(int i=0;i<=n-m;i++)	if(st.substring(i,i+m).equals(subst))	count++;
		
		System.out.print("Number of given SubString is: "+count);
	}
}