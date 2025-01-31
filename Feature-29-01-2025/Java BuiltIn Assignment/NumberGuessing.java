import java.util.*;

public class NumberGuessing{
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	public static void main(String[]args){
		System.out.println("Think a number between 1 and 100.");
		GuessingGame();
	}
	public static void GuessingGame(){
		int low = 1, high = 100,guess;
		boolean guessedCorrect = false;
		while(!guessedCorrect){
			guess = generateRandom(low,high);
			System.out.println("Does your number is:" + guess + "Press (H - Too High, L - Too Low, C - Correct)");
            char feedback = getFeedback();

            if (feedback == 'C') {
                System.out.println("I guessed your number correctly!");
                guessedCorrect = true;
            } else if (feedback == 'H') {
                high = guess - 1;
            } else if (feedback == 'L') {
                low = guess + 1;
            }
			
			if (low > high) {
                System.out.println("Oops! Something went wrong.");
                break;
            }
		}
	}
	public static int generateRandom(int low, int high) {
        return rd.nextInt(high - low + 1) + low;
    }
    public static char getFeedback() {
        char res;
        while (true) {
            res = sc.next().toUpperCase().charAt(0);
            if (res == 'H' || res == 'L' || res == 'C') {
                return res;
            } else {
                System.out.println("Invalid input. Please enter H (Too High), L (Too Low), or C (Correct).");
            }
        }
    }
}