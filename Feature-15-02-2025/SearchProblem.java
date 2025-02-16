import java.util.Arrays;
public class SearchProblem{
    public static int FirstMissingPositive(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(arr[i]>0&&arr[i]<=n&&arr[arr[i]-1]!=arr[i]){
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n+1; 
    }
    public static int BinarySearch(int[] arr,int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = {1, 7, -1, 9, 2, 6};
        int target = 6;
        int p = FirstMissingPositive(arr);
        System.out.println("First Missing Positive Integer: " + p);
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        int index = BinarySearch(arr, target);
        System.out.println("Index of " + target + " in sorted array: " + index);
    }
}