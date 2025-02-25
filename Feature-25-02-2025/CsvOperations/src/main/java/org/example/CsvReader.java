package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/example/students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] record;
            while ((record = reader.readNext()) != null) {
                System.out.println("Student ID: " + record[0]);
                System.out.println("Name: " + record[1]);
                System.out.println("Age: " + record[2]);
                System.out.println("Marks: " + record[3]);
                System.out.println("----------------------");
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
