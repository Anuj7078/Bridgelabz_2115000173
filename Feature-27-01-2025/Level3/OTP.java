import java.util.*;

public class OTP{
    public static int generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000;
        return otp;
    }

    public static boolean areUniqueOTPs(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        
        for (int otp : otps) {
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }

        if (areUniqueOTPs(otps)) {
            System.out.println("All OTPs are unique!");
        } else {
            System.out.println("Duplicate OTPs found!");
        }
    }
}
