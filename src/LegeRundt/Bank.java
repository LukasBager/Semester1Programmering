package LegeRundt;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        double accountBal = 816.21;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til Bagers Bank!");
        System.out.println("Dit kontoindestående er " + Double.toString(accountBal) + " kr.");
        System.out.println("Vil du hæve eller indsætte? Skriv \"hæv\" eller \"indsæt\"");

        String svar = scanner.next().toLowerCase();

        if (svar.equals("hæv")) {
            System.out.println("Hvor meget vil du hæve?");
            try {
                double amount = scanner.nextDouble();
                if (amount <= accountBal) {
                    accountBal -= amount;
                    System.out.println("Du har nu hævet " + Double.toString(amount) + " kr.");
                    System.out.println("Dit kontoindestående er nu " + Double.toString(accountBal) + " kr.");
                } else {
                    System.out.println("Du har ikke nok penge på din konto.");
                    System.out.println("Du har " + Double.toString(accountBal) + " kr. på din konto, men du forsøgte at hæve " + Double.toString(amount) + " kr.");
                    System.out.println("Vil du hæve det resterende beløb på din konto? Svar \"ja\" eller \"nej\".)");
                    String jaNejSvar = scanner.next().toLowerCase();
                    if (jaNejSvar.equals("ja")) {
                        System.out.println("Du har nu hævet " + Double.toString(accountBal));
                        accountBal = 0;
                        System.out.println("Dit kontoindestående er nu " + Double.toString(accountBal) + " kr.");
                    } else {
                        System.out.println("Du er ikke blevet trukket. Hav en god dag.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Du skal skrive et tal eller decimaltal");
            }
        } else if (svar.equals("indsæt")) {
            System.out.println("Hvor meget vil du sætte ind?");
            try {
                double amount = scanner.nextDouble();
                accountBal += amount;
                System.out.println("Du har nu indsat " + Double.toString(amount) + " kr. på din konto.");
                System.out.println("Dit kontoindestående er nu " + Double.toString(accountBal) + " kr.");
            } catch (Exception e) {
                System.out.println("Du skal skrive et tal eller decimaltal");
            }
        } else {
            System.out.println("Du skal svare enten \"hæv\" eller \"indsæt\"");
        }

    }

}
