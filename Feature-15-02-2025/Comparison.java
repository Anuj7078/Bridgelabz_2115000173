import java.io.*;
public class Comparison {
    public static void main(String[] args) {
        compareStringBuilderAndBuffer();
        compareFileReadingMethods("largefile.txt");
    }

    public static void compareStringBuilderAndBuffer() {
        int iterations = 1_000_000;
        String word = "hello";

        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(word);
        }
        long endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        System.out.println("StringBuilder Time: " + stringBuilderTime / 1_000_000 + " ms");

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(word);
        }
        endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        System.out.println("StringBuffer Time: " + stringBufferTime / 1_000_000 + " ms");

        System.out.println("StringBuilder is " + (double) stringBufferTime / stringBuilderTime + " times faster than StringBuffer.");
    }

    public static void compareFileReadingMethods(String filePath) {
        long fileReaderTime = readFileUsingFileReader(filePath);
        long inputStreamReaderTime = readFileUsingInputStreamReader(filePath);

        System.out.println("FileReader Time: " + fileReaderTime / 1_000_000 + " ms");
        System.out.println("InputStreamReader Time: " + inputStreamReaderTime / 1_000_000 + " ms");

        if (fileReaderTime < inputStreamReaderTime) {
            System.out.println("FileReader is faster.");
        } else {
            System.out.println("InputStreamReader is faster.");
        }
    }

    public static long readFileUsingFileReader(String filePath) {
        long startTime = System.nanoTime();
        int wordCount = 0;
        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        long endTime = System.nanoTime();
        System.out.println("Word Count using FileReader: " + wordCount);
        return endTime - startTime;
    }

    public static long readFileUsingInputStreamReader(String filePath) {
        long startTime = System.nanoTime();
        int wordCount = 0;
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length; 
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        long endTime = System.nanoTime();
        System.out.println("Word Count using InputStreamReader: " + wordCount);
        return endTime - startTime;
    }
}