import java.util.*;
public class FindTotalRoundstoComplete5Km {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side1 in meters: ");
        int side1 = sc.nextInt();
        System.out.println("Enter the length of side2 in meters: ");
        int side2 = sc.nextInt();
        System.out.println("Enter the length of side3 in meters: ");
        int side3 = sc.nextInt();
        int perimeter = side1 + side2 + side3;
        int rounds = (int) Math.ceil(5000 / perimeter);
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
    }
}
