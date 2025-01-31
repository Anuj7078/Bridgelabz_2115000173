import java.util.*;

// this program takes the distance in kilometers as input and converts it to miles.
class Problem8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int km = sc.nextInt();
		System.out.print("The total Miles is " + km * 0.625 + " for the given " + km + " kilometers");
	}
}
