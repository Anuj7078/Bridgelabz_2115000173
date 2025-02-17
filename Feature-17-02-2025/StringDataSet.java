public class StringDataSet {
    public static void main(String[] args) {
        int n = 1000000;
        System.out.println("Using String:");
        long stringTime = measureStringConcatenation(n);
        System.out.println("Time: " + stringTime + "ms");

        System.out.println("\nUsing StringBuilder:");
        long stringBuilderTime = measureStringBuilderConcatenation(n);
        System.out.println("Time: " + stringBuilderTime + "ms");

        System.out.println("\nUsing StringBuffer:");
        long stringBufferTime = measureStringBufferConcatenation(n);
        System.out.println("Time: " + stringBufferTime + "ms");
    }
    public static long measureStringConcatenation(int n) {
        long startTime = System.nanoTime();
        String result = "";
        for (int i=0;i<n;i++) {
            result += "a";
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }
    public static long measureStringBuilderConcatenation(int n) {
        long startTime = System.nanoTime();
        StringBuilder result = new StringBuilder();
        for (int i=0;i<n;i++) {
            result.append("a");
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }
    public static long measureStringBufferConcatenation(int n) {
        long startTime = System.nanoTime();
        StringBuffer result = new StringBuffer();
        for (int i=0;i<n;i++) {
            result.append("a");
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }
}
