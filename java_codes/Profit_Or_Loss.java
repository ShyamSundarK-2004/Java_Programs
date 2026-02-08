package java_codes;

import java.util.Scanner;

public class Profit_Or_Loss {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount invested:");
        double investment = sc.nextDouble();
        System.out.println("Enter the amount you made as a return:");
        double return_amt = sc.nextDouble();

        if (investment < 0 || return_amt < 0) {
            System.out.println("Invalid input! Investment and return amounts must be non-negative.");
        } else {
            double amt = return_amt - investment;

            if (amt > 0) {
                System.out.println("You got a profit of: " + amt);
            } else if (amt < 0) {
                System.out.println("You incurred a loss of: " + Math.abs(amt));
            } else {
                System.out.println("No profit, no loss! Totally Time waste!");
            }
        }

        
    }
}
