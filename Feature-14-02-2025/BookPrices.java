import java.util.*;
public class BookPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();

        double[] prices = new double[n];
        System.out.println("Enter the book prices: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }
        mergeSort(prices);
        System.out.println("Sorted book prices in ascending order:");
        System.out.println(Arrays.toString(prices));
        sc.close();
    }

    public static void mergeSort(double[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        double[] left = Arrays.copyOfRange(arr, 0, mid);
        double[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(double[] arr, double[] left, double[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
