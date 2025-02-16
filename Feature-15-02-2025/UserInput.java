import java.io.*;
public class UserInput{
    public static void main(String[] args) {
        String filePath = "input.txt"; 
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Enter text (type 'exit' to stop):");

            String userInput;
            while (true) {
                userInput = bufferedReader.readLine();

                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }

                bufferedWriter.write(userInput);
                bufferedWriter.newLine(); 
            }
            bufferedWriter.close();
            bufferedReader.close();

            System.out.println("User input has been saved to " + filePath);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}