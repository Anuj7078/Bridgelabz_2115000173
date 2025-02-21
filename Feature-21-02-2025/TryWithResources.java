import java.io.*;
public class TryWithResources {
    public static void main(String[] args) {
        String path = "Data.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String first = br.readLine();
            if(first != null)
                System.out.println(first);
        }
        catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
