package java_codes;

import java.util.Scanner;

public class Gross_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the basic salary: ");
        float basicSalary = sc.nextFloat();

        float hra, da, grossSalary;

        if (basicSalary < 1500) {
            hra = 0.1f * basicSalary;
            da = 0.9f * basicSalary;
        } else {
            hra = 500;
            da = 0.98f * basicSalary;
        }

        grossSalary = basicSalary + hra + da;

        System.out.println("Calculated Gross Salary: " + grossSalary);
    }
}
