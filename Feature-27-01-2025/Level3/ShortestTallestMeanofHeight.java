import java.util.*;

public class ShortestTallestMeanofHeight{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int []heights = new int[11];
		System.out.println("Enter Heights of Players in Cm(150cm - 250cm): ");
		for(int i=0;i<heights.length;i++)	heights[i] = sc.nextInt();
		int sum = SumOfHeight(heights);
		int mean = MeanOfHeight(heights,sum);
		int shortest = ShortestHeight(heights);
		int tallest = TallestHeight(heights);
		
		System.out.print("Mean of Heights of Player is: "+mean+" among them Shortest one is: "+shortest+" and Tallest one is: "+tallest);
	}
	public static int SumOfHeight(int arr[]){
		int sum = 0;
		for(int i=0;i<arr.length;i++)	sum += arr[i];
		return sum;
	}
	public static int MeanOfHeight(int arr[], int sum){
		return sum/arr.length;
	}
	public static int ShortestHeight(int arr[]){
		int shortest = arr[0];
		for(int i=1;i<arr.length;i++)	shortest = Math.min(shortest,arr[i]);
		return shortest;
	}
	public static int TallestHeight(int arr[]){
		int tallest = arr[0];
		for(int i=1;i<arr.length;i++)	tallest = Math.max(tallest,arr[i]);
		return tallest;
	}
	
}