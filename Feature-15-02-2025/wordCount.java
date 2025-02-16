import java.io.*;
public class wordCount {
    public static void main(String[] args) {
        String filePath = "sample.txt"; 
        String targetWord = "Java"; 
        int wordCount = 0; 
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) { 
                        wordCount++;
                    }
                }
            }
            bufferedReader.close();
            System.out.println("The word \"" + targetWord + "\" appears " + wordCount + " times in the file.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
