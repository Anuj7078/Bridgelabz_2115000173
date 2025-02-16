public class FirstNegativeNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -4, 5, -6};
        int index = findFirstNegativeIndex(array);
        if (index != -1) {
            System.out.println("The first negative number is at index: " + index);
        } else {
            System.out.println("There are no negative numbers in the array.");
        }
    }

    public static int findFirstNegativeIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return i;
            }
        }
        return -1; 
    }
}