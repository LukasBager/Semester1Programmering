package BankOOP;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account num_1000001 = new Account(1000001, "Lukas Emil Bager", 816.21);
        num_1000001.printAccountInfo();

        System.out.println("\nWould you like to deposit or withdraw? Answer \"withdraw\" or \"deposit\"");
        String svar = scanner.nextLine().toLowerCase();

        if (svar.equals("withdraw")) {
            System.out.println("How much would you like to withdraw? Please enter amount.");
            try {
                double amount = scanner.nextDouble();
                num_1000001.withdraw(amount);
            } catch (Exception e) {
                System.out.println("You did not enter an amount. You have not been charged or credited.");
            }
        } else if (svar.equals("deposit")) {
            System.out.println("How much would you like to deposit? Please enter amount.");
            try {
                double amount = scanner.nextDouble();
                num_1000001.deposit(amount);
            } catch (Exception e) {
                System.out.println("You did not enter an amount. You have not been charged or credited.");
            }
        } else {
            System.out.println("You did not answer \"withdraw\" or \"deposit\". You have not been charged or credited.");
        }

    }

}
