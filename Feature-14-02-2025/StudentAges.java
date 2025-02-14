import java.util.*;;
public class StudentAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[] ages = new int[n];
        System.out.println("Enter the ages of the students (between 10 and 18): ");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }
        countingSort(ages);
        System.out.println("Sorted Student ages:");
        System.out.println(Arrays.toString(ages));

        sc.close();
    }
    public static void countingSort(int[] arr) {
        int maxAge = 18;
        int minAge = 10;
        int[] count = new int[maxAge - minAge + 1];
        for (int age : arr) {
            count[age - minAge]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i + minAge;
                count[i]--;
            }
        }
    }
}
