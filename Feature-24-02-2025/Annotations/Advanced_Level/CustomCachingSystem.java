import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {
}

class ComputationallyExpensive {
    private static final Map<String, Integer> cache = new HashMap<>();

    @CacheResult
    public int expensiveCalculation(int input) {
        String cacheKey = "calc_" + input;
        
        if (cache.containsKey(cacheKey)) {
            System.out.println("Returning cached result...");
            return cache.get(cacheKey);
        }

        System.out.println("Performing expensive calculation...");
        int result = input * input;  

        cache.put(cacheKey, result);
        return result;
    }

    public void clearCache() {
        cache.clear();
    }
}

public class CustomCachingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComputationallyExpensive computationallyExpensive = new ComputationallyExpensive();

        while (true) {
            System.out.print("Enter a number for expensive calculation (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                int result = computationallyExpensive.expensiveCalculation(number);
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        scanner.close();
    }
}