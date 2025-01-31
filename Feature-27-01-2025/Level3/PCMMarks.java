import java.util.Random;
import java.util.Scanner;

public class PCMMarks{
    public static int[][] generateScores(int num) {
        Random rand = new Random();
        int[][] scores = new int[num][3];
        
        for (int i = 0; i < num; i++) {
            scores[i][0] = rand.nextInt(90) + 10;
            scores[i][1] = rand.nextInt(90) + 10;
            scores[i][2] = rand.nextInt(90) + 10;
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores, int num) {
        double[][] ans = new double[num][4];
        
        for (int i = 0; i < num; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            
            ans[i][0] = total;
            ans[i][1] = Math.round(average * 100.0) / 100.0;
            ans[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return ans;
    }

    public static void displayScorecard(int[][] scores, double[][] ans, int num) {
        System.out.println("Scorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        
        for (int i = 0; i < num; i++) {
            System.out.print("Student ");
            System.out.print(scores[i][0] + "\t\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t\t");
            System.out.print(ans[i][0] + "\t");
            System.out.print(ans[i][1] + "\t\t");
            System.out.println(ans[i][2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = scanner.nextInt();
        int[][] scores = generateScores(num);
        double[][] ans = calculateResults(scores, num);
        displayScorecard(scores, ans, num);
    }
}
