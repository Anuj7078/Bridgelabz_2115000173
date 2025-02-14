import java.util.*;
public class JobApplicants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of applicants: ");
        int n = sc.nextInt();
        int[] salaries = new int[n];
        System.out.println("Enter the salary demands of applicants: ");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }
        heapSort(salaries);
        System.out.println("Sorted salary demands in ascending order:");
        System.out.println(Arrays.toString(salaries));
        sc.close();
    }
    public static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i >= 1; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
