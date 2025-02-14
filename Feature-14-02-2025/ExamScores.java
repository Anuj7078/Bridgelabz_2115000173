import java.util.*;
public class ExamScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] scores = new int[n];
        System.out.println("Enter the exam scores: ");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        selectionSort(scores);
        System.out.println("Sorted exam scores in ascending order:");
        System.out.println(Arrays.toString(scores));

        sc.close();
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
