package java_codes;

import java.util.Scanner;

public class Salary_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender, qualification;
        int yearsOfService, salary = 0;

        System.out.println("Enter your gender (Male/Female): ");
        gender = sc.next();

        System.out.println("Enter your years of service: ");
        yearsOfService = sc.nextInt();

        System.out.println("Enter your qualification (Graduate/Post Graduate): ");
        qualification = sc.next();

        if (gender.equalsIgnoreCase("Male")) {
            if (yearsOfService >10) {
                salary = qualification.equalsIgnoreCase("Post Graduate") ? 15000 : 10000;
            } else {
                salary = qualification.equalsIgnoreCase("Graduate") ? 10000 : 7000;
            }
        } else if (gender.equalsIgnoreCase("Female")) {
            if (yearsOfService >= 10) {
                salary = qualification.equalsIgnoreCase("Post Graduate") ? 12000 : 9000;
            } else {
                salary = qualification.equalsIgnoreCase("Graduate") ? 8000 : 6000;
            }
        }
        System.out.println("Calculated Salary: " + salary);
    }
}
