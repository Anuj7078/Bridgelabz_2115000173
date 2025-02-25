package org.example;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWriter {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/example/employees.csv";
        String[][] employeeData = {
                {"ID", "Name", "Department", "Salary"},
                {"1", "Anuj", "Engineering", "75000"},
                {"2", "Bhagoaday", "HR", "50000"},
                {"3", "Kunal", "Marketing", "30000"},
                {"4", "Ashu", "Finance", "65000"}
        };
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            writer.writeAll(java.util.Arrays.asList(employeeData));
            System.out.println("Employee data written to CSV file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
