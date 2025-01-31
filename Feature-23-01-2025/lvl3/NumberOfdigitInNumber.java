package lvl3;
import java.util.*;
// Hello Sir in this question I am using my own approach as using loop and iterating would use O(n) time but converting it String and check String.length() would be a optimal O(1) approach.
public class NumberOfdigitInNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        sc.close();
        String str=""+n;
        System.out.println("Total digits in given number are: "+str.length());
    }
}
