package org.example;
import java.io.IOException;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;

public class FilterRecords {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/example/students.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.readNext();
            String[] record;
            while ((record = reader.readNext()) != null) {
                int marks = Integer.parseInt(record[3]);
                if(marks>80) {
                    System.out.println("Student ID: " + record[0]);
                    System.out.println("Name: " + record[1]);
                    System.out.println("Age: " + record[2]);
                    System.out.println("Marks: " + record[3]);
                    System.out.println("----------------------");
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
