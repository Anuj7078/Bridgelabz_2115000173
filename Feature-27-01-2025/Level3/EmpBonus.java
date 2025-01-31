import java.util.Random;

public class EmpBonus{

    public static double[][] generateEmployeeData(int num) {
        Random rand = new Random();
        double[][] Data = new double[num][2];
        
        for (int i = 0; i < num; i++) {
            Data[i][0] = rand.nextInt(90000) + 10000; 
            Data[i][1] = rand.nextInt(20) + 1; 
        }
        return Data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] Data, int num) {
        double[][] ansData = new double[num][3];
        
        for (int i = 0; i < num; i++) {
            double oldSalary = Data[i][0];
            int yearsOfService = (int) Data[i][1];
            double bonus = 0;

            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }
            
            double newSalary = oldSalary + bonus;
            ansData[i][0] = oldSalary;
            ansData[i][1] = newSalary;
            ansData[i][2] = bonus;
        }
        
        return ansData;
    }

    public static double[] calculateTotalSalariesAndBonus(double[][] ansData, int num) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < num; i++) {
            totalOldSalary += ansData[i][0];
            totalNewSalary += ansData[i][1];
            totalBonus += ansData[i][2];
        }

        return new double[]{totalOldSalary, totalNewSalary, totalBonus};
    }

    public static void displayEmployeeData(double[][] ansData, double[] totalSalariesAndBonus, int num) {

        for (int i = 0; i < num; i++) {
            System.out.print("Employee " + (i + 1) + "\t");
            System.out.print(ansData[i][0]);
            System.out.print(ansData[i][1]);
            System.out.println(ansData[i][2]);
        }

        System.out.println("Total Old Salary: " + totalSalariesAndBonus[0]);
        System.out.println("Total New Salary: " + totalSalariesAndBonus[1]);
        System.out.println("Total Bonus Paid: " + totalSalariesAndBonus[2]);
    }

    public static void main(String[] args) {
        int num = 10;
        double[][] employeeData = generateEmployeeData(num);
        double[][] ansData = calculateBonusAndNewSalary(employeeData, num);
        double[] totalSalariesAndBonus = calculateTotalSalariesAndBonus(ansData, num);
        displayEmployeeData(ansData, totalSalariesAndBonus, num);
    }
}
