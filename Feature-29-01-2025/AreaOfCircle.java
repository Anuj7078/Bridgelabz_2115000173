import java.util.*;
public class AreaOfCircle{
	private double Radius;
	Circle(double radius){
		Radius = radius;
	}
	private void setradius(int Radius){
		this.Radius = Radius;
	}
	private void displayAndCalculateArea(){
		double area = 3.14*Radius*Radius;
		System.out.println("Area of the Circle with the Radius: "+Radius+"is: "+area);
	}
	private void displayAndCalculateCircumference(){
		double circumference = 2*3.14*Radius;
		System.out.println("Circumference of the Circle with the Radius: "+Radius+"is: "+circumference);
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius of Circle: ");
		double radius = sc.nextDouble();
		Circle circle = new Circle(radius);
		circle.displayAndCalculateArea();
		circle.displayAndCalculateCircumference();
		circle.setradius(5);
		circle.displayAndCalculateArea();
		circle.displayAndCalculateCircumference();
		sc.close();
	}
}
