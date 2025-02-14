import java.util.*;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the marks of the students: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        BubbleSort(marks);
        System.out.println("Sorted marks in ascending order:"+Arrays.toString(marks));
        sc.close();
    }
    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
