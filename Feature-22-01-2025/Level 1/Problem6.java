// this program calculates the discount amount and final discounted fee of a course where the course price is INR 125000 and the discount is 10%
public class Problem6 {
    public static void main(String[] args) {
        int coursePrice = 125000;
        int discount = 10;
        int discountAmount = (coursePrice * discount) / 100;
        int finalPrice = coursePrice - discountAmount;
        System.out.println(
                "The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalPrice);
    }
}
