import java.util.Arrays;
public class SearchDataSet {
    public static void main(String[] args) {
        int[] dataset1k = createDataset(1000);
        int[] dataset10k = createDataset(10000);
        int[] dataset1m = createDataset(1000000);

        int target = 9000;

        System.out.println("Dataset Size: 1000");
        System.out.println("Linear Search Time: " + measureLS(dataset1k, target) + "ms");
        System.out.println("Binary Search Time: " + measureBS(dataset1k, target) + "ms");

        System.out.println("\nDataset Size: 10000");
        System.out.println("Linear Search Time: " + measureLS(dataset10k, target) + "ms");
        System.out.println("Binary Search Time: " + measureBS(dataset10k, target) + "ms");

        System.out.println("\nDataset Size: 1000000");
        System.out.println("Linear Search Time: " + measureLS(dataset1m, target) + "ms");
        System.out.println("Binary Search Time: " + measureBS(dataset1m, target) + "ms");
    }
    public static int[] createDataset(int n) {
        int[] dataset = new int[n];
        for (int i = 0; i < n; i++) {
            dataset[i] = i + 1;  
        }
        return dataset;
    }
    public static long measureLS(int[] dataset, int target) {
        long startTime = System.nanoTime();
        linearSearch(dataset, target);
        long endTime = System.nanoTime();
        return (endTime - startTime)/10;  
    }
    public static long measureBS(int[] dataset, int target) {
        Arrays.sort(dataset);  
        long startTime = System.nanoTime();
        binarySearch(dataset, target);
        long endTime = System.nanoTime();
        return (endTime - startTime)/10; 
    }
    public static void linearSearch(int[] dataset, int target) {
        for (int i = 0; i < dataset.length; i++) {
            if (dataset[i] == target) {
                return;
            }
        }
    }
    public static void binarySearch(int[] dataset, int target) {
        int left = 0, right = dataset.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dataset[mid] == target) {
                return;
            }
            if (dataset[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }
}
