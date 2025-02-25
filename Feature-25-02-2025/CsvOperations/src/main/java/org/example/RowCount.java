package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class RowCount {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/example/employees.csv";
        int rowCount = 0;
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.readNext();
            String[] record;
            while ((record = reader.readNext()) != null) {
                rowCount++;
            }
            System.out.println("Number of student records (excluding header): " + rowCount);
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
