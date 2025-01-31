import java.util.*;

public class CompareString{
	public static int compareString(String st1, String st2){
		int n  = st1.length();
		int m  = st2.length();
		int minLen = Math.max(n,m);
		
		for(int i=0;i<minLen;i++){
			if(st1.charAt(i) < st2.charAt(i))	return -1;
			else if(st1.charAt(i) > st2.charAt(i))	return 1;
		}
		
		if(n<m)	return -1;
		if(n>m)	return 1;
		return 0;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String 1: ");
		String st1 = sc.nextLine();
		System.out.print("Enter the String 2: ");
		String st2 = sc.nextLine();
		
		int ans = compareString(st1,st2);
		
		if (ans < 0) {
            System.out.println(st1 + " comes before " + st2 + " in lexicographical order");
        } else if (ans > 0) {
            System.out.println(st2 + " comes before " + st1 + " in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }
	}
}