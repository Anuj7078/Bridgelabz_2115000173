import java.util.*;

public class YoungestAndTallest{
	public static int findYoungest(int[] ages) {
        int minAge = ages[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) minAge = ages[i];
        }
        return minAge;
    }
    public static double findTallest(double[] heights) {
        double maxHeight = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) maxHeight = heights[i];
        }
        return maxHeight;
    }
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int []ages = new int[3];
		double []heights = new double[3];
		
		for(int i=0;i<3;i++){
			System.out.print("Enter the Ages:");
			ages[i] = sc.nextInt();
		}
		for(int i=0;i<3;i++){
			System.out.print("Enter the Heights:");
			heights[i] = sc.nextDouble();
		}
		
		System.out.println("The youngest friend is: " + findYoungest(ages));
        System.out.println("The tallest friend is: " + findTallest(heights));
	}
}