import java.util.Scanner;

// this program takes the perimeter of a square as input and calculates the length of the side of the square.
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter of the square");
        int perimeter = sc.nextInt();
        int side = perimeter / 4;
        System.out.println("The length of the side is " + side + " if the perimeter is " + perimeter);
    }
}
