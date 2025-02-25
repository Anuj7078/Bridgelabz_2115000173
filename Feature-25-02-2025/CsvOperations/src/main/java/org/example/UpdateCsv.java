package org.example;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateCsv {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/example/employees.csv";

        try (CSVReader reader = new CSVReader(new FileReader(filePath));
             CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {

            String[] record;
            boolean isFirstRow = true;
            while ((record = reader.readNext()) != null) {
                if (isFirstRow) {
                    writer.writeNext(record);
                    isFirstRow = false;
                    continue;
                }
                if (record[2].equals("IT")) {
                    double salary = Double.parseDouble(record[3]);
                    salary += salary * 0.10;
                    record[3] = String.valueOf(salary);
                }
                writer.writeNext(record);
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
