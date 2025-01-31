import java.util.Scanner;

// this program takes the number of people as input and calculates the total number of handshakes.
public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people");
        int n = sc.nextInt();
        int totalHandshakes = n * (n - 1) / 2;
        System.out.println("The total number of handshakes are " + totalHandshakes);
    }
}
