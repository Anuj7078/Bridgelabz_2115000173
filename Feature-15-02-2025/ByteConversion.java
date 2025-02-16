import java.io.*;
public class ByteConversion{
    public static void main(String[] args) {
        String filePath = "sample.txt"; 

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);

            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}