
import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        int youngest = Integer.MAX_VALUE, tallest = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of person : ");
            ages[i] = sc.nextInt();
            System.out.println("Enter height of person : ");
            heights[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            youngest = Math.min(youngest, ages[i]);
            tallest = Math.max(tallest, heights[i]);
        }
        System.out.println("Youngest is "+youngest + " and Tallest is " + tallest);
        sc.close();
    }
}
