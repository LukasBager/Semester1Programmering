package LegeRundt;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        double accountBal = 816.21;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til Bagers Bank!");
        System.out.println("Dit kontoindestående er " + Double.toString(accountBal) + " kr.");
        System.out.println("Vil du hæve eller indsætte? Skriv \"hæv\", \"indsæt\" eller \"hvidvask\"");

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
                        System.out.println("Dit kontoindestående er nu " + Double.toString(accountBal) + " kr. Hav en god dag.");
                    } else if (jaNejSvar.equals("nej")) {
                        System.out.println("Du er ikke blevet trukket. Hav en god dag.");
                    } else {
                        System.out.println("Du svarede hverken ja eller nej. Du er ikke blevet trukket. Hav en god dag.");
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
                System.out.println("Dit kontoindestående er nu " + Double.toString(accountBal) + " kr. Hav en god dag.");
            } catch (Exception e) {
                System.out.println("Du skal skrive et tal eller decimaltal");
            }
        } else if (svar.equals("hvidvask")) {
            System.out.println("Opretter Shell companies i Bahamas");
            System.out.println("Opretter selskaber i Holland og Schweiz");
            System.out.println("Opretter falske kvitteringer for køb af e-services o.l.");
            System.out.println("Overfører penge");
            System.out.println("Tillykke! Dine penge er nu i sikkerhed i Bahamas, langt væk fra SKAT's lange, grådige arm");
            System.out.println("Held og lykke med at bruge dem forresten - det kan være tricky");
        } else {
            System.out.println("Du svarede hverken \"hæv\", \"indsæt\" eller \"hvidvask\"");
        }

    }

}
