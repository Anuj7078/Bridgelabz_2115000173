public class SearchInMatrix{
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / cols][mid % cols]; 

            if (midElement == target) {
                return true; 
            } else if (midElement < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 5, 8},
            {10, 12, 18, 20},
            {21, 33, 39, 60}
        };
        int target = 12;
        boolean result = searchMatrix(matrix, target);
        System.out.println("Target found: " + result);
    }
}