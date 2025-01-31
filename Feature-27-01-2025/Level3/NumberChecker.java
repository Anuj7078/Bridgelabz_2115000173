import java.util.*;

public class NumberChecker{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int []digit = storeDigits(n);
		
		System.out.print("Length 0f Given Number is: "+countDigits(n));
		System.out.print("Given Number is:"+(DuckNumOrNot(digit)?" a ArmStrong Number":" Is not a ArmStrong Number"));
		System.out.print("Given Number is:"+(ArmstringOrNot(digit)?"Duck Number":"Is not a Duck Number"));
		int largest[] = LargestDigits(digit);
		System.out.print("Largest: "+largest[0]+"and Second Largest: "+largest[1]);
		int smallest[] = SmallestDigits(digit);
		System.out.print("Smallest: "+smallest[0]+"and Second Smallest: "+smallest[1]);
		
	}
	public static int[] LargestDigits(int[] arr) {
        int largest = Integer.MIN_VALUE, seconsdLargest = Integer.MIN_VALUE;
        for (int digit : arr) {
            if (digit > largest) {
                    secondLargest = largest;
                largest = digit;
            }
			else if (digit > secondLargest && digit != largest) {
                    secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
     }

=    public static int[] SmallestDigits(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } 
			else if (digit < secondSmallest && digit != smallest) {
				secondSmallest = digit;
            }
        }
         return new int[]{smallest, secondSmallest};
    }
	public static boolean ArmstrongOrNot(int []arr){
            int sum = 0;
            for (int digit : arr) sum += Math.pow(digit, arr.length);
            return sum == number;
	}
	public static boolean DuckNumOrNot(int []arr){
		for(int i=0;i<arr.length;i++)
			if(arr[i]==0)return false;
			return true;
	}
	}
	public static int countDigits(int n){
		return String.valueOf(Math.abs(n)).length();
	}
	public static int[] storeDigits(int n){
		String numString = String.valueOf(Math.abs(n));
		int digits[] = new int[numString.length()];
		for(int i = 0;i<numString.length();i++)	digits[i] = Character.getNumericValue(numString.charAt(i));
		return digits;
	}
}