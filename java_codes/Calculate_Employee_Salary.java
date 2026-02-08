package java_codes;

import java.util.Scanner;

public class Calculate_Employee_Salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the basic salary of the employee: ");
        float basicSalary = sc.nextFloat();

        System.out.println("Enter the current year: ");
        int currentYear = sc.nextInt();

        System.out.println("Enter the year in which the employee joined the organization: ");
        int joiningYear = sc.nextInt();

        float hra, da, grossSalary;
        int yearsOfService = currentYear - joiningYear;

        if (basicSalary < 10000) {
            hra = 0.2f * basicSalary;
            da = 0.8f * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.25f * basicSalary;
            da = 0.9f * basicSalary;
        } else {
            hra = 0.3f * basicSalary;
            da = 0.95f * basicSalary;
        }
        grossSalary = basicSalary + hra + da;

        if (yearsOfService > 3) {
            grossSalary += 2500;
        }
        System.out.println("Years of ex");

        System.out.println("Gross Salary: " + grossSalary);
    }
}
