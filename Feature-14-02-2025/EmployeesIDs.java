import java.util.*;
public class EmployeesIDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        int[] employees = new int[n];
        System.out.println("Enter the employee IDs: ");
        for (int i = 0; i < n; i++) {
            employees[i] = sc.nextInt();
        }
        insertionSort(employees);
        System.out.println("Sorted employee IDs in ascending order:");
        System.out.println(Arrays.toString(employees));

        sc.close();
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
