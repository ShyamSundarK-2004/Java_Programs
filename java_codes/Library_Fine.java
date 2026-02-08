package java_codes;

import java.util.Scanner;

public class Library_Fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of days taken to return the book:");
        int lateDays = sc.nextInt();

        if (lateDays <= 5) {
            System.out.println("Fine: " + (lateDays * 0.5));
        } else if (lateDays <= 10) {
            System.out.println("Fine: " + (5 * 0.5 + (lateDays - 5) * 1));
        } else if (lateDays <= 30) {
            System.out.println("Fine: " + (5 * 0.5 + 5 * 1 + (lateDays - 10) * 5));
        } else {
            System.out.println("Membership Cancelled");
        }
    }
}
