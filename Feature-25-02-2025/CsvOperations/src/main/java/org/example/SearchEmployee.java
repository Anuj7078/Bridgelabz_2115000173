package org.example;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "src/main/java/org/example/employees.csv";
        System.out.println("Enter Employee name you want to search:");
        String name = sc.nextLine();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            reader.readNext();
            String[] record;
            while ((record = reader.readNext()) != null) {
                String str = record[1];
                if(str.equals(name)) {
                    System.out.println("Department-> " + record[2]);
                    System.out.println("Salary-> " + record[3]);
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
