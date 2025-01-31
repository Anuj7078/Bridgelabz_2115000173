import java.util.*;

public class TrignometryFunction{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Angle:");
		double angle = sc.nextDouble();
		double []ans = calculateTrigonometricFunctions(angle);
		System.out.println("Sine: " + ans[0] + ", Cosine: " + ans[1] + ", Tangent: " + ans[2]);
	}
	public static double[] calculateTrigonometricFunctions(double angle){
		double rad = Math.toRadians(angle);
        return new double[] { Math.sin(rad), Math.cos(rad), Math.tan(rad) };
	} 
}